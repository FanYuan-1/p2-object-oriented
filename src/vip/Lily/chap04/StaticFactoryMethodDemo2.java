package vip.Lily.chap04;

import java.util.Scanner;

public class StaticFactoryMethodDemo2 {
    public static void main(String[] args) {
        Gender male = Gender.male();
        Gender female = Gender.female();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入性别：0-男，1-女");
        int value = scanner.nextInt();
        Gender gender = Gender.valueOf(value);
        System.out.println("性别为：" + gender.getLabel());
    }
}
