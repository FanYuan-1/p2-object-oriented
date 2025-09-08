package vip.Lily.users.ui;

import vip.Lily.chap04.Result;
import vip.Lily.users.entity.User;
import vip.Lily.users.service.UserService;

import java.util.Scanner;

public class UserCMDUI implements UserUI {
    private Scanner scanner = new Scanner(System.in);

    private UserService userService;

    public UserCMDUI(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void hello()
    {
        while (true){
            System.out.println("欢迎来到用户管理系统");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.退出");
            System.out.print("请输入你的选择：");

            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    registerUI();
                    break;
                case 2:
                    loginUI();
                    return;
                case 3:
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("无效的选择");
                    break;
            }
        }

    }

    private void registerUI() {
        while (true){
            //打印注册表单
            String username = nextString("请输入用户名：");
            String password = nextString("请输入密码：");
            String password2 = nextString("请再确认密码：");
            if(username == null || password == null || password2 == null){
                System.out.println("输入不能为空");
                continue;
            }
            //校验两次密码是否一致
            if(!password.equals(password2)){
                System.out.println("两次密码不一致");
                continue;
            }
            //调用业务逻辑层注册
            Result result = userService.register(username,password);
            //处理结果
            if(result.isSuccess()){
                System.out.println("注册成功");
                User user = (User) result.getData();
                System.out.println("您的ID："+user.getId());
                return;
            }
            //处理失败
            System.out.println("注册失败" + result.getMsg());
            //询问是否重新注册
            String option = nextString("是否重新注册？(y/n)");
            if(option.equalsIgnoreCase("n")){
                return;
            }
        }
    }

    private String nextString (String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    private void loginUI() {
        while (true){
        //登录表单
        String username = nextString("请输入用户名：");
        String password = nextString("请输入密码：");
        if(username == null || password == null ){
            System.out.println("输入不能为空");
            continue;
        }
        //调用业务逻辑层登录
        Result result = userService.login(username,password);
        //处理结果
            if(result.isSuccess()){
                System.out.println("登录成功");
                User user = (User) result.getData();
                System.out.println("您的ID："+user.getId());
                return;
            }
            //处理失败
            System.out.println("登录失败" + result.getMsg());
            //询问是否重新登录
            String option = nextString("是否重新登录？(y/n)");
            if(option.equalsIgnoreCase("n")){
                return;
            }
        }
    }
}
