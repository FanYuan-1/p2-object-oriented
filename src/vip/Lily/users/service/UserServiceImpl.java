package vip.Lily.users.service;

import vip.Lily.chap04.Result;
import vip.Lily.users.dao.UserDatabase;
import vip.Lily.users.entity.User;

public class UserServiceImpl implements UserService {

    private UserDatabase userDB;

    public UserServiceImpl(UserDatabase userDB) {
        this.userDB = userDB;
    }


    //注册
    @Override
    public Result register(String username, String password){
        //校验数据信息
        if(isEmptyString(username)){
            return Result.error("用户名不能为空");
        }
        if(isEmptyString(password)){
            return Result.error("密码不能为空");
        }
        //校验用户名是否存在
        User user = userDB.findByUsername(username);
        if(user != null){
            return Result.error("用户名已存在");
        }
        //保存用户信息
        user = new User(username, password);
        userDB.add(user);
        return Result.success(user);
    }
    //登录
    @Override
    public Result login(String username, String password){
        //校验数据信息
        if(isEmptyString(username)){
            return Result.error("用户名不能为空");
        }
        if(isEmptyString(password)){
            return Result.error("密码不能为空");
        }
        //校验用户名是否存在
        User user = userDB.findByUsername(username);
        if(user == null){
            return Result.error("用户名不存在");
        }
        //校验密码是否正确
        if(!password.equals(user.getPassword())){
            return Result.error("密码错误");
        }
        return Result.success(user);
    }

    private static boolean isEmptyString(String str) {
        return str == null || str.equals("");
    }
}
