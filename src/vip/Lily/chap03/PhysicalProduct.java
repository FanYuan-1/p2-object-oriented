package vip.Lily.chap03;

public class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public void sendProduct() {
        System.out.println("正在快递发货...");
    }

    private double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String displayInfo(){
        return super.displayInfo() + "，重量为：" + weight + "g";
    }
}
