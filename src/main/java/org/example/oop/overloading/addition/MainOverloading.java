package org.example.oop.overloading.addition;

public class MainOverloading {
    public static void main(String[] args) {
        main();
        main("exemplu");
    }
    public static void main(){
        System.out.println("main ul care nu primeste parametru");
    }
    public static void main(String text){
        System.out.println("main ul care primeste parametru");
    }
}
