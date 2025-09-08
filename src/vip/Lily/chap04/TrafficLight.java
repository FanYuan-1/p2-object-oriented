package vip.Lily.chap04;

public class TrafficLight {
    private String label;
    private TrafficLight nextLight;

    private TrafficLight(String label) {
        this.label = label;
    }

    private static final TrafficLight RED;
    private static final TrafficLight YELLOW;
    private static final TrafficLight GREEN;


    static {
        RED = new TrafficLight("RED");
        GREEN = new TrafficLight("GREEN");
        YELLOW = new TrafficLight("YELLOW");
        RED.nextLight = GREEN;
        GREEN.nextLight = YELLOW;
        YELLOW.nextLight = RED;
    }
    public String getLabel() {
        return label;
    }

    public TrafficLight getNextLight() {
        return nextLight;
    }

}
