package org.example.tema.annalynsinfiltration;

public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

        //boolean result = !knightIsAwake && !archerIsAwake && prisonerIsAwake;

        return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent);
        //boolean result = (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent);
        //return result;
    }
}