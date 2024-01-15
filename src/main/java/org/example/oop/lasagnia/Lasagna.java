package org.example.oop.lasagnia;

public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        actualMinutes = 30;
        //if (actualMinutes >= 40) {
        //return 0;
        //}
        //return 40 - actualMinutes;
        return expectedMinutesInOven() - actualMinutes;
        //return actualMinutes >= expectedMinutesInOven() ? 0 : expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int layers) {

        return layers * 2;
    }

    public int totalMinutes(int layers, int minutes) {
        int preparationMinutes = preparationTimeInMinutes(layers);
        int remainingMinutes = remainingMinutesInOven(minutes);
        return preparationMinutes + remainingMinutes;


    }
}

