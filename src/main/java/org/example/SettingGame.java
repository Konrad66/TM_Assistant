package org.example;

public class SettingGame {


    public void welcome(){
        System.out.println("Witaj w asystencie rozkładania gry. Wybierz etap który sprawia dla Ciebie trudność.");
        System.out.println("Plansza");
        System.out.println("Kości");
        System.out.println("Karty");


// 9 - wyjscie
    }


    public void controll(String input){
        if(input.equals("1")){
            firstStep();
        }
    }


    public void control(String input) {
        switch (input) {
            case "1":
                System.out.println("Plansza");
                firstStep();
                break;
            case "2":
                System.out.println("działa");
                secondStep();
                break;
            default:
                System.out.println("Powtórz wybór");
        }

    }

    public void firstStep() {
        System.out.println("Planszę należy umieścić na środku stołu. Wszystkie 9 obszarów oceanów należy umieścić na odpowiadającym im polu Wskaźnika Globalneg. Znaczniki Temperatury i Poziomu Tlenu należy umieścić na początkowych pozycjach odpowiednich torów. Znacznik pokoleń należy umieścić na polu „1” toru WT");
    }

    public void secondStep() {
        System.out.println("Kostki zasobów i pozostałe obszary należy umieścić w miejscu dostępnym dla wszystkich graczy.");
    }

    public void thirdStep() {
        System.out.println("Talia projektów. Należy się upewnić, że wśród kart projektów i kart korporacji nie ma kart z „Ery Korporacyjnej”. Takie karty zostały oznaczone w lewym dolnym rogu symbolem (czerwone koło z białym trójkątem). Karty projektów należy potasować, a następnie umieścić obok planszy. Obok talii należy pozostawić miejsce na stos kart odrzuconych.");
    }

    public void fourthStep() {
        System.out.println("Gracze. Gracz, który jako ostatni widział film lub czytał książkę z gatunku fantastyki naukowej, otrzymuje znacznik pierwszego gracza. Wszyscy gracze otrzymują po 1 planszy gracza i znaczniki w wybranych przez siebie kolorach. Gracze umieszczają swoje znaczniki na polach „1” torów produkcji zasobów na swoich planszach. Każdy z graczy zaznacza też znacznikiem swoją początkową pozycję (pole „20”) na torze WT");
    }

    public void fifthStep() {
        System.out.println("Karty korporacji. Gracze rozpoczynający przygodę z „Terraformacją Marsa” otrzymują po 1 karcie „Korporacji dla początkujących”. Zgodnie ze znajdującymi się na niej poleceniami otrzymują po 42 Megakredyty (M€) i dobierają po 10 kart projektów (te 10 kart to darmowa początkowa ręka gracza). W tym momencie początkujący gracze mogą przejrzeć swoje karty, natomiast doświadczeni gracze kontynuują przygotowanie do gry, pominąwszy ten krok. Wszystkie 10 kart standardowych korporacji (wyłączywszy 2 korporacje z „Ery Korporacyjnej”) należy potasować i rozdać każdemu z doświadczonych graczy po 2 z nich.");
    }

    public void sixthStep() {
        System.out.println("Karty projektów. Każdemu z doświadczonych graczy należy rozdać po 10 kart projektów. Gracz będzie mógł zakupić każdą z tych kart za 3 M€. Zakupione karty utworzą jego początkową rękę. W tym momencie gracze rozważają swoje początkowe ręce i korporacje");
    }

    public void seventhStep() {
        System.out.println("Warunki początkowe. Każdy doświadczony gracz wybiera korporację, którą chce grać, a także te z 10 kart projektów, które chce zatrzymać. Zgodnie z ustaloną kolejnością doświadczeni gracze ujawniają wybrane korporacje, otrzymują początkowe zasoby i poziomy produkcji, a następnie płacą po 3 M€ za każdą z zatrzymanych kart projektów. Karty projektów, których gracze nie chcą zatrzymać, należy odrzucić (odrzucone korporacje należy odłożyć do pudełka). Karty zawsze odrzuca się rewersami ku górze! Gracze powinni być świadomi, że przez następne kilka pokoleń (dopóki nie rozruszają swojej gospodarki) ich zasoby będą znacznie ograniczone.");
    }

    public void eighthStep() {
        System.out.println("Rozpoczęcie rozgrywki. Podczas pierwszego pokolenia pomija się fazę kolejności i badań (gracze odbyli je podczas przygotowania do gry) – pierwszy gracz rozpoczyna od fazy akcji.");
    }
}
