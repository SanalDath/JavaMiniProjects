package TrafficLight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        TrafficLight[] lights = TrafficLight.values();

        //get all names and action values of lights array using for each loop

        for(TrafficLight light: lights){
            System.out.println("Signal color : " + light.name() + " Signal action : " + light.getAction());
        }
    }
}
