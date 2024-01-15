package org.example.oop.overloading.addition;

public class MainAdder {
    public static void main(String[] args) {
        Adder add = new Adder();

        //int result = add.add(9, 7);
        //String resultString = add.add("c", "b");
        double restDouble = add.add("22",5);
        //System.out.println("Suma este: " + result);
        //System.out.println("Suma este: " + resultString);
        System.out.println(restDouble);

    }
}
