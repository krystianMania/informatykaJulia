package metody;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        meow();
//        List<String> newLIst = makeList();
//        System.out.println();
//        String chuj = makeString();
//
//        Scanner scanner = new Scanner(System.in);
//        kurwaniewiem();
//        Integer nazwaZmiennej = makeInteger(scanner.nextInt());
//        System.out.println(nazwaZmiennej);
        makeKalkulator();

    }
    //budowa metode
    //1. modyfikator dostemou public private protected
    //public metiod widoczna na wysokosci calego repozytorium, protected w paczce, private tylko w kalsie
    //2. static metoda styczna nie wymaga wywyolania instacji nalezy do klasy nie obiektu
    //3. lement zwracany obiekt jesli jic nie zwraca to void
    //4. nazwa metody + konstruktor czyli "()" w srodku konstruktora wrzucasz obiekty potrzebne do wywolania metody
    //5. cialo metody w "{}" czyli pmelepmenatcja co metoda rovi
    //6. jesli zwraca cps to "return" i po tym nazwa obiektu zwracanego

    public static void meow() {
        System.out.println("meow");
    }

    public static List<String> makeList() {
        List<String> sasa = List.of("sdsfds", "shfhdf");
        return sasa;
    }

    public static String makeString() {
        String kurwa = "dfdfd";
        return kurwa;
    }

    public static Integer makeInteger(Integer cyfraPodawana) {
        Integer cyfraZwracana = cyfraPodawana;
        return cyfraZwracana;
    }

    public static void kurwaniewiem() {
        System.out.println("podaj licbe");
    }

    //stworz kalkulator w metodzie i pzniej ja wywolaj tzn wybierz opcje 1-4 dodawanie odejmowanie dzielenie mnozenie
    // 5 koniec pracy kalkulatora break;
    // po wybraniu opcji 1-4 zapytaj o liczby i podaj wynik wroc do mmomentu startowego menu po otrzymaniu wyniku typu wyibeirzopcje

    public static void makeKalkulator() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("wybierz operacje \n 1- dodawanie \n 2-odejmowanie \n 3-mnozenie \n 4-dzielenie \n 5-zamknij kalkulatror");
            int podanaliczba = scanner.nextInt();
            if(podanaliczba!=1 && podanaliczba!=2 && podanaliczba!=3 && podanaliczba!=4 && podanaliczba!=5 ){
                System.out.println("brak takiej opcji jeszcze raz zrob ");
                continue;
            } else if (podanaliczba==5) {
                System.out.println("zamykanie kalkulatora");
                break;
            }
            System.out.println("podaj liczbe a");
            int a = scanner.nextInt();
            System.out.println("podaj liczbe b");
            int b = scanner.nextInt();
            int wynik = 0;
            if (podanaliczba == 1) {
                wynik = a + b;
                System.out.println(wynik);
            } else if (podanaliczba == 2) {
                wynik = a - b;
                System.out.println(wynik);
            } else if (podanaliczba == 3) {
                wynik = a * b;
                System.out.println(wynik);
            } else {
                wynik = a / b;
                System.out.println(wynik);
            }
        }


    }

}
