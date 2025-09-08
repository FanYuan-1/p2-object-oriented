package vip.Lily.chap01;

public class ObjectDome {
    public static void main(String[] args) {
        // 创建对象
        Girl girl = new Girl();
        // 对象名.属性名
        girl.name = "Lily";
        girl.height = 170;
        girl.weight = 50;
        System.out.println(girl.name);
        System.out.println(girl.height);
        System.out.println(girl.weight);
        // 对象名.方法名()
        int bmi = girl.calculateBMI();
        System.out.println(girl.name + "的BMI是" + bmi);
    }
}
