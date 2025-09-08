package vip.Lily.chap04;

public class Gender {
    private int value;
    private String label;

    private Gender(int value, String label) {
        this.value = value;
        this.label = label;
    }

    private static final Gender MALE = new Gender(0, "男");
    private static final Gender FEMALE = new Gender(1, "女");

    public static Gender male() {
        return MALE;
    }

    public static Gender female() {
        return FEMALE;
    }

    public static Gender valueOf(int value){
        if(value != 0 && value != 1){
            throw new IllegalArgumentException("value must be 0 or 1");
        }
        return value == 0 ? MALE : FEMALE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
