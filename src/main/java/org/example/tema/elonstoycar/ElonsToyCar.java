package org.example.tema.elonstoycar;

public class ElonsToyCar {

    private int distanceDrivin;
    private int batteryPercentage;


    public ElonsToyCar(int distanceDrivin, int batteryPercentage) {
        this.distanceDrivin = distanceDrivin;
        this.batteryPercentage = batteryPercentage;
    }

    public static ElonsToyCar buy() {

        return new ElonsToyCar(0, 100);
    }

    public String distanceDisplay() {
        return "Distance drivin is " + distanceDrivin + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage > 0) {
            return "Battery percentage is " + batteryPercentage + "%";
        } else {
            return "Battery is empty";
        }
    }

    public void drive() {
        distanceDrivin = distanceDrivin + 20;
        batteryPercentage = batteryPercentage - 1;

    }
}