package org.example;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        SettingGame settingGame = new SettingGame();
        settingGame.setUpStep();
        System.out.println(settingGame.listaStringow.get(2));

        System.out.println("Witaj w asystencie TM. Poniżej masz kilka opcji do wyboru");
        System.out.println("1. Pomoc przy rozkładaniu gry.");
        System.out.println("2. Interaktywna instrukcja.");
        System.out.println("3. Pomoc przy liczeniu punktów.");
        System.out.println("4. Opuść asystenta gry.");

        String wybor = scanner.next();
        if (wybor.equals("1")) {
            assistWithGameSetup();
        } else if(wybor.equals("2")){
            assistWithInstruction();
        }
        else {
            System.out.println("nie działa");
        }




    }

    public static void assistWithGameSetup() {
        SettingGame settingGame = new SettingGame();
        settingGame.welcome();
        String wybor = scanner.next();
        switch (wybor) {
            case "1" -> {
                System.out.println();
                System.out.println("działa");
            }
            case "2" -> System.out.println(settingGame.listaStringow.get(0));
            case "3" -> System.out.println();
            case "4" -> System.out.println();
            case "5" -> System.out.println();
            case "6" -> System.out.println();
            case "7" -> System.out.println();
            case "8" -> System.out.println();
            default -> System.out.println("reszta nie działa ");
        }


    }

    public static void assistWithInstruction(){

    }

}


//refaktowyzowanie - poprawianie jakości kodu bez zmiany jego działania
// 1. Oszczędność czasu na zrozumienie kodu
// 2. Minimalizujemy ryzyko błędu
// 3. Przyszpieszenie i ułatwienie wprowadzania zmian w kodzie (w tym się zawiera unikanie powtórek)
// Zaciąganie długu technologicznego to jest pomijanie refaktoryzacji