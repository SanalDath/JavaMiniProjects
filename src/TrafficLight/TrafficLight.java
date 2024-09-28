package TrafficLight;

public enum TrafficLight {
    RED("stop"),
    YELLOW("wait"),
    GREEN("Go");

    private String action;

    //Constructor
    private TrafficLight (String action){
        this.action = action;
    }

    //Getter method
    public String getAction(){
        return action;
    }
}
