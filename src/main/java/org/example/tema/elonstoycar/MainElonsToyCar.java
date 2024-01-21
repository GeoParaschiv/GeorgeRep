package org.example.tema.elonstoycar;

public class MainElonsToyCar {
    public static void main(String[] args) {

        ElonsToyCar car = ElonsToyCar.buy();

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());


        //Task 6
        for (int i = 0; i < 100; i++) {
            car.drive();
        }
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}
