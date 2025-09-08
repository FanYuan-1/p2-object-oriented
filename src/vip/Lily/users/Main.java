package vip.Lily.users;

import vip.Lily.users.dao.UserDatabaseInMemory;
import vip.Lily.users.service.UserServiceImpl;
import vip.Lily.users.ui.UserCMDUI;
import vip.Lily.users.ui.UserGUI;
import vip.Lily.users.ui.UserUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("程序启动了");
        // 创建一个用户服务
        UserUI userUI = new UserCMDUI(new UserServiceImpl(new UserDatabaseInMemory()));
        userUI.hello();
    }
}
