package org.example.oop.animals;

public abstract class Animal {

    protected boolean isEating;

    private boolean isSleeping;

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public boolean isEating() {
        return isEating;
    }

    public void setEating(boolean eating) {
        isEating = eating;
    }

    public abstract void printSomething();
}
