package vip.Lily.chap05;

import vip.Lily.chap03.Product;

public class Order {
    private Product product;
    private int amount;
    private Coupon coupon;

    public Order(Product product, int amount,Coupon coupon) {
        this.product = product;
        this.amount = amount;
        this.coupon = coupon;
    }

    public void displayOrderInfo() {
        //1.计算商品总价
        double totalPrice = product.getPrice()*amount;
        //2.计算优惠金额
        int discount = coupon.calculateDiscount(totalPrice);
        //3.显示订单信息
        System.out.println("商品名称："+product.getName());
        System.out.println("商品价格："+product.getPrice());
         System.out.println("购买数量："+amount);
         System.out.println("商品总价："+totalPrice);
         System.out.println("优惠金额："+discount);
         System.out.println("实付金额："+(totalPrice-discount));
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }
}
