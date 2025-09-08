package vip.Lily.users.dao;

import vip.Lily.users.entity.User;

public interface UserDatabase {
    boolean add(User user);

    // 查找用户
    User findByUsername(String username);
}
