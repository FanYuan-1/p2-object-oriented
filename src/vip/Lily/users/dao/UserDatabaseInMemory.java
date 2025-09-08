package vip.Lily.users.dao;

import vip.Lily.users.entity.User;

public class UserDatabaseInMemory implements UserDatabase {
    private static final int MAX_SIZE = 1000;
    private static final User[] USERS = new User[MAX_SIZE];
    private static int size = 0;

    @Override
    public boolean add(User user){
        // 判断用户表是否已满
        if(size >= MAX_SIZE){
            System.out.println("用户表已满，无法添加");
            return false;
        }
        // 添加用户
        USERS[size++] = user;
        user.setId(size);
        return true;
    }

    // 查找用户
    @Override
    public User findByUsername(String username){
        if(username == null || username.equals("")){
            return null;
        }
       // 遍历用户表
        for (int i = 0; i < size; i++) {
            User user = USERS[i];
            // 判断用户名是否相同
            if(user != null && username.equals(user.getUsername())){
                return user;
            }
        }
        // 没有找到用户
        return null;
    }
}
