package org.example.oop.overloading.addition;

public class Adder {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public String add(String a,String b){
        int value1 = Integer.parseInt(a); //pasam din int in string
        int value2 = Integer.parseInt(b);
        int rez = value1 + value2;

        return String.valueOf(rez); //transformam din string in int
        //daca concatenezi un nr cu un string devine automat string
        //return rez + "";
    }
    public double add(String a, double b){
        double value1 = Double.parseDouble(a); // transformam in nr intreg
        return value1 + b;
    }
}
