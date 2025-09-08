package vip.Lily.chap03;

public class DigitalProduct extends Product{
    private String secretKey;

    public DigitalProduct(String name, double price, String secretKey) {
        super(name, price);
        this.secretKey = secretKey;
    }

    public void sendProduct() {
        System.out.println("正在网络发货...");
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ",密钥：" + "***********";
    }

    private String getSecretKey() {
        return secretKey;
    }

    private void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
