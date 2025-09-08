package vip.Lily.users.ui;

import vip.Lily.chap04.Result;
import vip.Lily.users.entity.User;
import vip.Lily.users.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserGUI implements UserUI {
    private UserService userService;
    private JFrame frame;
    private JPanel panel;
    private JButton registerButton;
    private JButton loginButton;
    private JButton exitButton;

    public UserGUI(UserService userService) {
        this.userService = userService;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("用户管理系统");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        registerButton = new JButton("注册");
        loginButton = new JButton("登录");
        exitButton = new JButton("退出");

        panel.add(registerButton);
        panel.add(loginButton);
        panel.add(exitButton);

        frame.add(panel);
        frame.setVisible(true);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUI();
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUI();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void hello() {
        // GUI初始化后直接显示主界面
    }

    private void registerUI() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JPasswordField passwordField2 = new JPasswordField();

        Object[] message = {
                "用户名:", usernameField,
                "密码:", passwordField,
                "确认密码:", passwordField2
        };

        int option = JOptionPane.showConfirmDialog(frame, message, "注册", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String password2 = new String(passwordField2.getPassword());

            if (username.isEmpty() || password.isEmpty() || password2.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "输入不能为空");
                return;
            }

            if (!password.equals(password2)) {
                JOptionPane.showMessageDialog(frame, "两次密码不一致");
                return;
            }

            Result result = userService.register(username, password);
            if (result.isSuccess()) {
                User user = (User) result.getData();
                JOptionPane.showMessageDialog(frame, "注册成功\n您的ID：" + user.getId());
            } else {
                JOptionPane.showMessageDialog(frame, "注册失败: " + result.getMsg());
            }
        }
    }

    private void loginUI() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        Object[] message = {
                "用户名:", usernameField,
                "密码:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(frame, message, "登录", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "输入不能为空");
                return;
            }

            Result result = userService.login(username, password);
            if (result.isSuccess()) {
                User user = (User) result.getData();
                JOptionPane.showMessageDialog(frame, "登录成功\n您的ID：" + user.getId());
            } else {
                JOptionPane.showMessageDialog(frame, "登录失败: " + result.getMsg());
            }
        }
    }
}
