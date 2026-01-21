package konstrukcja.warunkowa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //konstrukcja warunkowa masz kilka warunkow i program wybiera dzialanie na posatwie warunku
//
//        Scanner scanner2 = new Scanner(System.in);
//        //budowa
//        System.out.println("podaj liczbe a");
//        int a = scanner2.nextInt();
//        System.out.println("podaj liczbe b");
//        int b = scanner2.nextInt();
//
//        if (a > b) {
//            System.out.println("a jest wieksze");
//        } else {
//            System.out.println("b wieksze");
//        }
//
//
//        if (a > b) {
//            System.out.println("a wieszkne niz b");
//        } else if (a < b) {
//            System.out.println("a mniejsze od b");
//
//        } else if (a == b) {
//            System.out.println("a i b sa rozwne");
//        }
//
//
//        // kontruktory >= <= ! == a dla sting .equals()
//
////        String imie1 = "sasas";
////        String imie2 = "sasas";
////        if (imie1.equals(imie2)) {
////            System.out.println("sukces");
////        }
//
//        //stworz kalkulator zapytaj sie od o opcje 1-4 jakie typu dzilanie doaj w sumie jszce jako 5 reszte z dzilenie
//        // pozniej zapytaj o liczby i podaj wynik
//
//
//        /*System.out.println("wybierz dzialanie jakie chcsz wykocnac podaj cyre od 1-4 \n 1-dodawanie \n 2-odejnowanie \n 3-mnozenie \n 4-dieelenie \n 5-reszta z dzielenia");
//        int opcja = scanner2.nextInt();
//        System.out.println("podaj liczbe a");
//        int a = scanner2.nextInt();
//        System.out.println("podaj liczbe b");
//        int b = scanner2.nextInt();
//
//        if (opcja == 1) {
//            System.out.println((a + b) + " wyniik dodawnia a + b");
//        } else if (opcja == 2) {
//            System.out.println((a - b) + " wynik odejmowania");
//
//        } else if (opcja == 3) {
//            System.out.println((a * b) + " wynik mnozenia");
//        } else if (opcja == 4) {
//            System.out.println((a / b) + " wynik dzielenia");
//        } else if (opcja == 5) {
//            System.out.println((a % b) + " wynik reszta z dzielenika");
//        }*/
//
//        //zadanie jeden mes
//
////        Zadanie 1 – Zmienne i Scanner
////
////        Napisz program, który:
////
////        pobierze z klawiatury dwie liczby całkowite,
////
////        obliczy i wyświetli ich sumę, różnicę, iloczyn oraz iloraz (jeśli drugi argument ≠ 0).
//
//        Scanner scanner5 = new Scanner(System.in);
//        System.out.println("podaj liczbe d");
//        int d = scanner5.nextInt();
//        System.out.println("podaj liczbe e");
//        int e = scanner5.nextInt();
//        int dodawanie = d + e;
//        int odejmowanie = d - e;
//        int mnozenie = d * e;
//        int dzielenie = 0;
//        if (e != 0) {
//            dzielenie = d / e;
//
//        }
//
//        System.out.println("wynik dodawania wynosi " + dodawanie + "\n" + "wynik odejmowania liczby e od liczby d wynosi "
//                + odejmowanie + "\n" + "wynik mnozenia wynosi " + mnozenie + "\n" + "wynik dzieleni liczby d przez liczbe e wynosi " + dzielenie);
//        System.out.println("----------");
//
//        //zadanie dwa
//        /*System.out.println("podaj liczbe i");
//        int i = scanner5.nextInt();
//        if(i<0){
//            System.out.println("liczba " + i +" jest ujemna");
//        }
//        else if (i==0) {
//            System.out.println("liczba " + " jest rowna zero");
//        }
//        else{
//            System.out.println("liczba " + i +" jest dodatnia");
//        }*/
//        System.out.println("----------");
//
//
//        // zadanie 3
//        //for(int i = 0;i<=100;i+=5){
//        // System.out.println(i);
//
//        // }
//        System.out.println("----------");
//
//        // zadanie 4
//        int suma = 0;
//        while (true) {
//            System.out.println("podaj licze");
//            int liczba = scanner5.nextInt();
//            if (liczba == 0) {
//                break;
//            }
//            suma += liczba;
//        }
//        System.out.println("suma = " + suma);
//        System.out.println("----------");
//
//
//        // zadanie 5
//        int[] tab = new int[5];
//        int i = 0;
//        while (i < 5) {
//            System.out.println("podaj liczbe");
//            int liczba = scanner5.nextInt();
//            tab[i] = liczba;
//            i++;
//        }
//        System.out.println("liczby tablicy to:");
//        for (int element :
//                tab
//        ) {
//            System.out.println(element);
//
//        }
//        System.out.println("----------");
//
//        //zadanie 6
//        System.out.println("podaj ilosc liczb ktora chcesz podac");
//        int wielkosc = scanner5.nextInt();
//        int[] tab4444 = new int[wielkosc];
//        int j = 0;
//
//        while (true) {
//            System.out.println("podaj liczbe");
//            int liczba = scanner5.nextInt();
//            tab4444[j] = liczba;
//            j++;
//            if (j == wielkosc) {
//                break;
//            }
//        }
//        int najwikeszaLiczba = tab4444[0];
//        for (int pol = 0; pol <= tab4444.length; pol++) {
//            if (tab4444[pol] > najwikeszaLiczba) {
//                najwikeszaLiczba = tab4444[pol];
//            }
//        }
////        for (int element4444:tab4444
////             ) {
////            System.out.println(element4444);
////
////        }
//        System.out.println(najwikeszaLiczba);
//        System.out.println("----------");
//
//        //zadanie 7
//        int k = 0;
//        double suma22 = 0;
//        while (k < 10) {
//            System.out.println("podaj liczbe");
//            int liczba333 = scanner5.nextInt();
//            suma22 += liczba333;
//            k++;
//        }
//        double srednia = suma22 / 2;
//        System.out.println(srednia);
//        System.out.println("----------");
//
//        //zadanie 8
//        int n = 4;
//        int[] tab5566 = new int[n];
//        int l = 0;
//        while (l < n) {
//            System.out.println("podaj liczbe");
//            int liczba555 = scanner5.nextInt();
//            int reszta = liczba555 % 2;
//            if (reszta == 0) {
//                tab5566[l] = liczba555;
//                l++;
//            }
//
//        }
//        System.out.println("liczby parzyste to: ");
//        for (int element5566 : tab5566
//        ) {
//            System.out.println(element5566);
//
//        }
//
////        while(true){
////            System.out.println("ile chcesz podac liczb");
////            int iloscLiczb = scanner5.nextInt();
////            int[] tablica = new int[iloscLiczb];
////            System.out.println("czy chcesz podaj liczbe 1=tak, 2=nie");
////            int odp = scanner5.nextInt();
////
//////            int[] tablica = new int[]; nowa tablica
////            if (odp == 1){
////                int liczbaWZadaniu = scanner5.nextInt();
////                t
////            }
////        }
//        //zadanie 9
//
//        //zadanie 10
//        int z = 0;
//        double suma33 = 0;
//        int[] tab44444 = new int[5];
//        while (z < 5) {
//            System.out.println("podaj liczbe tera");
//            int liczb44444 = scanner5.nextInt();
//            tab44444[z] = liczb44444;
//            suma33 += liczb44444;
//            z++;
//        }
//        double srednia44444 = suma33 / z;
//        int h = 0;
//        for (int elemen444444 : tab44444
//        ) {
//            if (elemen444444 > srednia44444) {
//                System.out.println("liczba " + elemen444444 + " jest wiekszy od srednie arytmetycznej wszystkich wystepujacych liczb \n " +
//                        "srednia jest rowno " + srednia44444);
//                h++;
//            }
//
//        }
//        System.out.println(h + " liczb jest wieksze od sredniej");




    }
}
