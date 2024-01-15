package org.example.oop.annalynsinfiltration;

public class MainAnnalynsInfiltration {
    public static void main(String[] args) {

        AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();
        System.out.println(annalynsInfiltration.canFastAttack(true));

        System.out.println(annalynsInfiltration.canSpy(false, true, false));

        System.out.println(annalynsInfiltration.canSignalPrisoner(false, true));

        System.out.println(annalynsInfiltration.canFreePrisoner(false,
                true,
                false,
                false));
    }
}
