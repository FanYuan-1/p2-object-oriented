package vip.Lily.chap02;

public class Employee {
    //基础工资
    private int baseSalary;
    //奖金
    private int bonus;

    public Employee(int baseSalary, int bonus){
        setBaseSalary(baseSalary);
        setBonus(bonus);
    }

    public  int calculateSalary(char grade) {
        //计算奖金系数
        double rate = calculateBate(grade);
        //计算工资
        return baseSalary + (int) (bonus * rate);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary < 0){
            throw new IllegalArgumentException("基础工资必须大于0");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private int getBonus() {
        return bonus;
    }

    private void setBonus(int bonus) {
        if(bonus <= 0){
            throw new IllegalArgumentException("奖金必须大于或等于0");
        }
        this.bonus = bonus;
    }

    private double calculateBate(char grade){
        return switch (grade){
            case 'A' -> 1.0;
            case 'B' -> 0.8;
            case 'C' -> 0.6;
            case 'D' -> 0.4;
            default -> 0;
        };
    }
}