package org.example.oop.overloading.car;

public class MainCar {
    public static void main(String[] args) {

        Car car1 = new Car("Natasha"); //class, nume class, car() = constructor, new = instanta
        Car car2 = new Car();
        Car car3 = new Car("SuperSpeed", "rosie");
        Car car4 = new Car("Geanina", "negru", "BaMaWezi");

        car4.printDetails("","","");
        car4.printDetails("","");
        car4.printDetails("");
        //System.out.println("Numele masinii este: " + car3.getNume() + " si este " + car3.getCuloare());
        //System.out.println("Masina mea este: "+car4.getNume()+" culoarea ei este "+car4.getCuloare()+" marca ei este "+car4.getMarca());

        System.out.println(car4);

    }

}