package vip.Lily.chap04;

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("学生人数" + Student.getCount());

        Student s1 = new Student("张三", "男");
        Student s2 = new Student("李四", "女");

        System.out.println("学生人数" + Student.getCount());
        System.out.println(s1.displayInfo());
        System.out.println(s2.displayInfo());
        System.out.println(Student.getCount());
    }
}
