package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Witaj w asystencie TM. Poniżej masz kilka opcji do wyboru");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Pomoc przy rozkładaniu gry.");
        System.out.println("2. Interaktywna instrukcja.");
        System.out.println("3. Pomoc przy liczeniu punktów.");
        System.out.println("4. Opuść asystenta gry.");
        int wybor = scanner.nextInt();
        if (wybor == 1){
            rozkladanie();
        }
        if (wybor == 2 ){
            instrukcja();
        }
        if (wybor == 2 ){
            instrukcja();
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

    public static void rozkladanie(){
        System.out.println("pomoge Ci rozłożyć gre!");

    }

    public static void instrukcja(){
        System.out.println("Witaj w panelu instrukcji. Czego chciałbyś się dowiedzieć?");
    }


    public static void punkty(){
        System.out.println("Witaj w panelu podliczaniu punktów. ");
    }


}
