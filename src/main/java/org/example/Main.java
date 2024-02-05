package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        SettingGame settingGame = new SettingGame();
        System.out.println("Witaj w asystencie TM. Poniżej masz kilka opcji do wyboru");

        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Pomoc przy rozkładaniu gry.");
        System.out.println("2. Interaktywna instrukcja.");
        System.out.println("3. Pomoc przy liczeniu punktów.");
        System.out.println("4. Opuść asystenta gry.");
        String wybor = scanner.next();

        if (wybor.equals("1")) {
            settingGame.welcome();
            wybor = scanner.next();
            if (wybor.equals("1")) {
                settingGame.firstStep();
            } else if (wybor.equals("2")) {
                settingGame.secondStep();
            } else if (wybor.equals("3")) {
                settingGame.thirdStep();
            } else {
                System.out.println("reszta nie działa ");
            }
        } else {
            System.out.println("nie działa");
        }


    }

/*

Menu główne:
pomoc przy rozkładaniu gry
pomoc przy liczeniu punktów
interaktywna instrukcja


Rzuć kostką i dobierz surowce
Wykonaj 3 akcje
Zresetuj karty
Wyjście

Który z podpunktów chcesz rozwinąć?


 */

    public static void rozkladanie() {
        System.out.println("pomoge Ci rozłożyć gre!");

    }

    public static void instrukcja() {
        System.out.println("Witaj w panelu instrukcji. Czego chciałbyś się dowiedzieć?");
    }


    public static void punkty() {
        System.out.println("Witaj w panelu podliczaniu punktów. ");
    }


}
