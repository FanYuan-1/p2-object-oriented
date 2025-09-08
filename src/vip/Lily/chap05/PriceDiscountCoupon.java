package vip.Lily.chap05;

public class PriceDiscountCoupon implements Coupon{
    private int threshold;
    private int discount;

    public PriceDiscountCoupon(int discount, int threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }

    @Override
    public int calculateDiscount(double totalPrice){
        return totalPrice >= threshold ? discount : 5;
    }
}
