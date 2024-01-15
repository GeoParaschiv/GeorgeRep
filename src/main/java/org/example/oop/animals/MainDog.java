package org.example.oop.animals;

public class MainDog {
    public static void main(String[] args) {
        Dog caine1;    //clasa  //nedefinit
        //Dog = new Dog("Grivei",6,"Pomeranian");   //obiect //instanta 1
        Dog Dog = new Dog("Azorel",3,"Bulldog");   //instanta 1
        Dog dog3 = new Dog();  //instanta 1

        //Dog dog4 = null; // nu are valoare // instanta 4

        //Dog.name = "Grivei"; - cand devine privat nu mai pot folosim asta
        Dog.setName("Azorel");
        //System.out.println(Dog.getName());
        //System.out.println(Dog);

        /*String s1 = "ana";
        String s2 = "ana";*/
        //System.out.println("Obiectele sunt la fel?" + Dog.equals(Dog));
        //System.out.println("Obiectele sunt la fel?" + "ana".equals("ana"));  //asa se compara stringurile

        //Dog.setAge(5);
        //System.out.println("Varsta cainelui este de " + s1.equals(s2));

        //Dog.setBreed("Caucazian");
        //System.out.println("Rasa cainelui este " + Dog.getBreed());

        System.out.println(Dog.getStaticMembre());
        System.out.println(Dog.getStaticMembre());
        Dog.membre = 3;

        dog3.setSleeping(true);
        System.out.println(dog3.isSleeping());

        dog3.isEating();

        Animal animal = new Animal() {
            @Override
            public void printSomething() {

            }
        };
        animal.isEating = true;
        dog3.isEating = false;

    }
}
