package vip.Lily.chap01;

public class Girl {
    String name ;
    int height ;
    double weight ;

    int calculateBMI(){
        double heightInMeter = height / 100.0 ;
        return (int) (weight / (heightInMeter * heightInMeter)) ;
    }
}
