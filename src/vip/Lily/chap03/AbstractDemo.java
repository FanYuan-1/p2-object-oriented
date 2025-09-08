package vip.Lily.chap03;

public class AbstractDemo {
    public static void main(String[] args) {
        PhysicalProduct p = new PhysicalProduct("鼠标", 100.00, 43);
        DigitalProduct d = new DigitalProduct("充值卡", 100.00, "123456");

        sendProduct(p, d);
    }

    public static void sendProduct(Product ... products){
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            product.sendProduct();
        }
    }
}
