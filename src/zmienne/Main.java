package zmienne;


import java.time.temporal.JulianFields;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //dsdsafddsfdsgfds
        //Oblsuga podstawowa + budowanie metod/funckji
        //juz w tablecie
        //w nawiasie albo teskt osobny albo zmienna (nazwa)
        System.out.println();

        //sposob na czytanie danych z konsoli
        Scanner scanner = new Scanner(System.in);

    /*
    Typy zmiennych

    String - kalsa tekstowa zawsze w cudzyslowie wartosc np "sasas"
    int - klasa liczbowa w mniejszym zakresie = np 1
    long - klasa liczbowa w wiekszym zakresie = np 2
    double - klasa liczbowa zmienna przecinkwpa = np2.01
    char - klasa znakowa np 'a' pojedynczy cuzsylow
    boolean - klasa warunowa true or false tyutaj bez cudzslowa
     */
        // znak specjalny \n - enter
        System.out.println("Ala m\na kota");


        // znak specjalny \s - spacja
        System.out.println("Ala m\sa kota");

        // znak specjalny \t - tabulator
        System.out.println("Ala m\ta kota");
    /*
        zmienne to typy danych ktore przechowywuja pewne wartosci
        nazwy zmiennych piszemy z malej litery, jesli nazwa jest dwuczlonowa to uzywamy camel caseow (wielka litera kolejnego czlonu nazwy
        !!! NAZWY ZMIENNYCH NIE MOGA SIE POWTARZAC !!!
        budowa zmiennej:
        typZmiennej nazwaZmiennej = wartosc;
         */
        // * W momencie laczenia dwoch znakow czyli zmiennych typu char
        // otrzymujemy kod ascii decimal value
        //System.out.println(znak + znak1);

        // ZADANIA
        // Zadeklaruj zmienne ktore poznales i wypisz je na konsoli
        String a = "dfjed";
        int b = 145;
        long c = 483945489;
        double d = 3.46;
        char znakJeden = 'k';
        boolean nazwa = true;

        System.out.println(a);

        // kilka zmiennych w soucie wywolujemy przy ucyzicu plusa "+"
        System.out.println(a + " " + b + c + d + znakJeden);

        // nastepnie przypisz do niej inna wartosc i znowu ja wypisz na konsoli

        a = "kupa";
        System.out.println(a);

        //dzialania na mziennych
        // + -> dodawanie, laczenie zmiennych
        // - -> odejmowanie
        // * -> mnozenie
        // / -> dzielenie
        // % -> reszta z dzielnia

        int liczba1 = 5;
        int liczba2 = 25;
        int liczba3 = 6;
        int wynikDodawania = (liczba2 + liczba1);
        int wynikOdjmowania = (liczba1 - liczba2);
        int wynikMnozenia = (liczba1 * liczba2);
        int wynikDzielenie = (liczba2 / liczba1);
        int resztaZDzielenia = (liczba3 % liczba1);
        double liczba4 = 7.3;
        double liczba5 = 4.64;
        double wynikDodawania1 = (liczba4 + liczba5);
        double wynikOdjmowania1 = (liczba4 - liczba5);
        double wynikMnozenia1 = (liczba4 * liczba5);
        double wynikDzielenie1 = (liczba5 / liczba4);
        double resztaZDzielenia1 = (liczba4 % liczba5);

        System.out.println();
        System.out.println("liczba 1 to " + liczba1 + " licbza 2 " + liczba2 + " wynik dodoawania to " + wynikDodawania);
        System.out.println("wynik odejmowania to " + wynikOdjmowania);
        System.out.println("wynik mnozenia to " + wynikMnozenia);
        System.out.println("wynik dzieleniea to " + wynikDzielenie);
        System.out.println("reszta z dzielenia " + liczba3 + " przez liczbe " + liczba1 + " to " + resztaZDzielenia);
        System.out.println();
        System.out.println("liczba 4 to " + liczba4 + " licbza 5 " + liczba5 + " wynik dodoawania to " + wynikDodawania1);
        System.out.println("wynik odejmowania to " + wynikOdjmowania1);
        System.out.println("wynik mnozenia to " + wynikMnozenia1);
        System.out.println("wynik dzieleniea to " + wynikDzielenie1);
        System.out.println("reszta z dzielenia " + liczba4 + " przez liczbe " + liczba5 + " to " + resztaZDzielenia1);
        int x = 5;
        System.out.println("X: " + x);
        //dodawanie dlusci tekstow do siebie
        String tekst2 = "ja";
        int dodawanieDlugsciStringow = a.length() + tekst2.length() ;
        // zwiekszenie zmiennej poprzez przypisanie tej samej wartosci + 3

        // zwiekszenie aktualnej wartosci zmiennej o 2
        x += 2;

        // zmieniejszenie aktualnej wartosci o 5
        x -= 5;


        //   *=     /=
        x *= 4;
        System.out.println("X:" + x);
        // przemnozenie aktualnej wartosci o 4
        x /= 5;
        System.out.println("X: " + x);
        // podzielenie aktualnej wartsoci o 5

        // Zadanie domowe
        // 1. Zadeklaruj dwie zmienne stringowe imie i nazwisko oraz jedna zmienna int ktora bedzie przechowywac wiek
        // Stworz ladny output ktory wykorzysta powyzsze zmienne i wypisze mi np taki tekst:
        // Mam na imie <wartosc zmiennej stringowej> i moje nazwisko to <wartosc zmiennej stringowej>
        // oraz mam <wartosc zmiennej intowej> lat.
        //
        // * Mile widzane wlasne polaczenia zmiennych
        // oraz wytworzenie podobnych komunikatow opierajacych sie na polaczeniu zmiennych :)
        String imie = "Julia";
        String nazwisko = "niew";
        int wiek = 10;
        System.out.println("mam na imie " + imie + " na nazwisko " +  nazwisko + " i mam " + wiek + " lat ");
    }
}
