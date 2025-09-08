package vip.Lily.chap02;

public class SalaryDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(10000,5000);
        int salary = employee.calculateSalary('B');
        System.out.println("工资为：" + salary);
    }

}