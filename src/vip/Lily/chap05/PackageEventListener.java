package vip.Lily.chap05;

public class PackageEventListener implements MouseEventListener, KeyEventListener{
    @Override
    public void onclick() {
        System.out.println("展开");
    }

    @Override
    public void onkeydown(String... keys) {
        System.out.println("搜索");
    }
}
