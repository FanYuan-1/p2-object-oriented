package vip.Lily.chap03;

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static PhysicalProduct createPhysicalProduct(String name, double price, double weight){
        return new PhysicalProduct(name,price,weight);
    }

    public static DigitalProduct createDigitalProduct(String name, double price, String secretKey){
        return new DigitalProduct(name,price,secretKey);
    }

    public String displayInfo(){
        return "商品名称："+name+"，商品价格："+price;
    }

    public abstract void sendProduct();

    private void setName(String name) {
        this.name = name;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
