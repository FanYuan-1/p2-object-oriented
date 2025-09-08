package vip.Lily.chap05;

import vip.Lily.chap03.Product;

public class InterfaceDemo {
    public static void main(String[] args) {
        Product product = Product.createPhysicalProduct("鼠标", 100.00, 43);

        Coupon coupon = new PriceDiscountCoupon(10, 100);

        Order order = new Order(product, 1, coupon);

        order.displayOrderInfo();

        System.out.println("---------------------");
        Coupon coupon1 = new RateDiscountCoupon(100, 85);
        order.setCoupon(coupon1);
        order.displayOrderInfo();
    }
}
