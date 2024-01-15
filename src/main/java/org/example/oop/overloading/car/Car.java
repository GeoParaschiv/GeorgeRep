package org.example.oop.overloading.car;

public class Car {

    private String nume;
    private String culoare;
    private String marca;

    public Car(String nume){
this.nume = nume;
    }
    public Car(String nume, String culoare){
        this.nume = nume;
        this.culoare = culoare;

    }

    public Car() {

    }
public Car(String nume, String culoare, String marca){
        this(nume,culoare);
        this.marca = marca;
}

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    /*@Override
    public String toString() {
        return "Car{" +
                "nume='" + nume + '\'' +
                ", culoare='" + culoare + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }*/

    @Override
    public String toString(){
        return nume + " " + culoare + " " + marca;
    }

    public void printDetails(String option1){
        System.out.println("Numele masinii"+ nume);

    }
    public void printDetails(String option1, String option2){
        System.out.println("Numele masinii si culoarea "+nume + culoare);
    }

    public void printDetails(String option1, String option2,String option3){
        System.out.println("Numele masinii si culoarea si marca" + nume + culoare + marca);
    }


}
