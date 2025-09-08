package vip.Lily.chap03;

public class ExtendDome {
    public static void main(String[] args) {
        PhysicalProduct p = new PhysicalProduct("鼠标", 100.00, 43);

        DigitalProduct d = new DigitalProduct("充值卡", 100.00, "123456");

        createOrder(p);
        createOrder(d);
    }

    public static void createOrder(Product product) {
        //1.展示商品信息
        System.out.println(product.displayInfo());
        //2.确认订单
        System.out.println("确认订单");
    }
}
