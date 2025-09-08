package vip.Lily.chap04;

import vip.Lily.chap03.DigitalProduct;
import vip.Lily.chap03.PhysicalProduct;

public class StaticFactoryMethodDemo3 {
    public static void main(String[] args) {
        PhysicalProduct p = new PhysicalProduct("鼠标", 100.00, 43);

        DigitalProduct d = new DigitalProduct("充值卡", 100.00, "123456");
    }
}
