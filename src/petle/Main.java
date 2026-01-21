package petle;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //pierwsze notatki petle ich typy i konstrukcje
        //1 petla while
        //wykorzystujemy kiedy liczba powtrzoen nie jest znanana
        // konstrukcja
        // while(warunek){
        //instrukcje do wykonania
        //}

        int licznik = 1;
        System.out.println("\n");


        while (licznik < 10) {
            System.out.println("to jest petla");
            licznik++; //++ przypisuje  wartosc o 1 wieksza
        }
        System.out.println("koniec petli");
        System.out.println("\n");

        //2 petla do while
        //wykona sie przynmajmniej raz warunek jest sprawdzany dopiero po wykonaniu
        //konstrukcja
        //do{
        //instrukcje
        //}
        //while(warunek);

        System.out.println("\n\n");

        int licznik2 = 0;

        do {
            System.out.println("to jest petla");
            licznik2++;
        } while (licznik2 <= 10);
        System.out.println("koniec petli");
        System.out.println("\n");

        //3 petla for
        //slowo for(deklaracja zmiennej iterujacej; warunek ktory musi byc spelniony aby wejsc do petli; instrukcja co sie dzieje ze zmienna iterującą)
        //uzywamy kiedy znamy dokladna ilosc powtorzen
        //konstrukcja
        //for(wyrażenie początkowe; warunek; modyfikatorLicznika){
        //instrukcje do wykonania
        //}

        for (int i = 0; i < 10; i++) {
            System.out.println("to jest petla");
        }
        System.out.println("koniec");
        System.out.println("\n");

        //4 petla foreach
        //stowrzona do tablic lub list polega na tym ze kazdego obiektu
        //konstruckcja
        //for(Typ_Obiektu nazwa_obiektu : nazwa_tablicy){ ... }
        //lub
        //for(Typ_Obiektu nazwa_obiektu : nazwa_kolekcji){ ... }

        System.out.println("\n\n");

        // zrob petle jedna gdzie 10 razy wyswietli slowo halo i druga gdzie beda widoczny licznik i jak on sie mzienia
        // i zrob to dla kazdej petli raz z ikrementacja a raz dekrementacja

        int licznik3 = 0;
        do {
            System.out.println("halo");
            licznik3++;
        } while (licznik3 < 9);
        System.out.println("koniec");


        System.out.println();

        int licznik4 = 0;
        while (licznik4 < 10) {
            System.out.println(licznik4);
            licznik4++;
        }
        System.out.println("koniec");


        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("koniec");


        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("koniec");

//        Zadanie 1 — pętla while
//
//        Cel: kontrola licznika i warunku zakończenia
//
//👉 Napisz program, który:
//
//        zaczyna od liczby 50
//
//        w każdej iteracji:
//
//        zmniejsza licznik o 4
//
//        wypisuje jego aktualną wartość
//
//        kończy pętlę, gdy licznik stanie się mniejszy niż 0
//
//        po pętli wypisuje Koniec

           int licznik12 = 50;
           while (licznik12 >= 0) {
               System.out.println(licznik12);
               licznik12-=4;
           }

            System.out.println();

//        Zadanie 2 — pętla for
//
//        Cel: iteracja z krokiem innym niż 1
//
//👉 Napisz program, który:
//
//        używa jednej pętli for
//
//        wypisuje co drugą liczbę:
//
//        od 1 do 30
//
//        po zakończeniu wypisuje Gotowe

         for(int i = 1; i <= 30; i+=2){
             System.out.println(i);
         }
        System.out.println("cwel");

        System.out.println("--------------");


        //Na nasteopnych zjaeciach skaner konstrukcja warubnowa i etle z konstrukcja warunkowa zadania i moze tablice
    }
}
