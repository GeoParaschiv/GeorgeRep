package org.example.tema.blackjack;

import org.junit.Before;
import org.junit.jupiter.api.Test;



    public class MainBlackJack {
        public static void main(String[] args) {
            BlackJack blackjack = new BlackJack();

            int primaCarte = BlackJack.parseCard("ace");
            int aDouaCarte = BlackJack.parseCard("king");

            String rezultat = blackjack.firstTurn("ace","king","ace");
            System.out.println(rezultat);
        }
    }
