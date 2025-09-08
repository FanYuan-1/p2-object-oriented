package vip.Lily.users.service;

import vip.Lily.chap04.Result;

public interface UserService {
    //注册
    Result register(String username, String password);

    //登录
    Result login(String username, String password);
}
