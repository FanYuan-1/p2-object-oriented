package vip.Lily.chap04;

public class MathUtil {
    final static double PI = 3.1415926535897932384626433832795;

    public static double toRadians (double degrees){
        return  degrees * PI / 180;
    }

    public static double toDegrees (double radians){
        return  radians * 180 / PI;
    }
}
