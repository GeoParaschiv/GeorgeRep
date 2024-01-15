package org.example.oop.vendingmachine;

public class VendingMachine {

    private int sold;
    private String locatie;
    private int x, y;
    private Snack[][] snackuri;

public void rest(){

}
    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Snack[][] getSnackuri() {
        return snackuri;
    }

    public void setSnackuri(Snack[][] snackuri) {
        this.snackuri = snackuri;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "sold=" + sold +
                ", locatie='" + locatie + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public VendingMachine(int sold, String locatie, int x, int y) {
        this.sold = sold;
        this.locatie = locatie;
        this.x = x;
        this.y = y;
        snackuri = new Snack[x][y];



    }

    public Snack getSnack(int x,int y){
        Snack snack = snackuri[x][y];
        return snack;

    }

public void setSnacksInVendingMachine(String snack,int x,int y){

}

}
