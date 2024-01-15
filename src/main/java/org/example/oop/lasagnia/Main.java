package org.example.oop.lasagnia;

public class Main {
    public static void main(String[] args) {

        Lasagna lasagna1 = new Lasagna();
        System.out.println("Expected minutes in the oven is "+lasagna1.expectedMinutesInOven()+" mins");
        System.out.println(lasagna1.remainingMinutesInOven(40));
        System.out.println(lasagna1.remainingMinutesInOven(40-10));
        System.out.println("Time for preparing a layer of lasagna is "+ lasagna1.preparationTimeInMinutes(1*2) +" mins");
        System.out.println("Total minutes: " + lasagna1.totalMinutes(3, 20));

    }
}
