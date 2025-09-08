package vip.Lily.chap04;

public class Student {
    private static int count = 0;

    public static int getCount() {
        return count;
    }


    private int id;
    private String name;
    private String gender;

    public Student( String name, String gender) {
        count++;
        this.id = count;
        this.name = name;
        this.gender = gender;
    }

    public String displayInfo() {
        return "学号:" + id + ",姓名:" + name + ",性别:" + gender;
    }
}
