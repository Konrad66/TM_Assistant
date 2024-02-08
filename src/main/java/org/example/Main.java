package org.example;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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
                settingGame.firstStepp();
                System.out.println("działa");
            }
            case "2" -> settingGame.secondStep();
            case "3" -> settingGame.thirdStep();
            case "4" -> settingGame.fourthStep();
            case "5" -> settingGame.fifthStep();
            case "6" -> settingGame.sixthStep();
            case "7" -> settingGame.seventhStep();
            case "8" -> settingGame.eighthStep();
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