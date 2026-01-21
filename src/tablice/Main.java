package tablice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Kiedy uzywasz petli foreach do iteracji po tablicy otrzymujesz kopie kazdego elementu a nie odwolanie do faktycznegoi elementu tablicy
        oznaczo to ze modeyfikowanie tej kopi nie zmieni oryginalenego elementu w tablicy

        W trradycyjnej petli for masz dostep do indeksu kazdego elementu tablicy co umozlwiea bezposrednie modyfikowanie elementow
        tablicy mozesz uzyc indeksu do odwoalanie sie bezposerednio do lementu i zmienic jego wartosc
        */
        // indeksowanie od 0

//        int[] tabzad3 = {6, 21, 32, 10};
//
//        int[] tab1 = new int[3];
//
//        tab1[0] = 5;
//        tab1[1] = 1;
//        tab1[2] = 5;
////        tab1[3] = 5;
//
//        int[] tab2 = new int[5];
//        for (int i = 0; i < 5; i++) {
//            tab2[i] = i + 2;
//        }

        //petla foreach stowrozna dom obiektow wielsokaldowychtzn kilka zmiennych przseswietla kazdy argumetn w nich kazda zmienna
        // musisz zainicjowac intowy n o nazwie elemnt po dwukropku nazwe tablicy(obiektu) i w ciala metody {co ma robic}
//        for (int element :
//                tab2) {
//            System.out.println(element);
//        }
//
//        System.out.println(tab2[2]);

        //3 napisz program ktory zamieni pierwszy z osatnim elementem tablicy .lenght

        int[] tab3 = {1, 2, 3, 4, 5, 6};
        int element1 = tab3[0];
        int element2 = tab3[tab3.length - 1];
        tab3[0] = element2;
        tab3[tab3.length - 1] = element1;

        for (int wartosci : tab3) {
            System.out.println(wartosci);
        }

        System.out.println();

        //2 stworz 2 tablice o tych samych rozmiarach dodaj odpowiadajace sobie elementu i wyniki pokaz w 3 tabeli

        int[] tab4 = {1, 2, 3, 4, 5, 6};
        int[] tab5 = {6, 5, 4, 3, 2, 1};
        int[] tab6 = new int[tab4.length];


        for (int i = 0; i <= tab4.length - 1; i++) {
            tab6[i] = tab4[i] + tab5[i];

        }
        for (int wartosc1 : tab6
        ) {
            System.out.println(wartosc1);
        }
        System.out.println();

        //4 stworz tablice ktora zwiera slowa nastpenie odwroc ich kolejnosc .reverse.toString().

        String[] tab7 = {"jeden", "dwa"};
        for (int i = 0; i <= (tab7.length - 1); i++){
            tab7[i] = new StringBuilder(tab7[i]).reverse().toString();
        }

        for (String element:
             tab7) {
            System.out.println(element);
        }

        //5 napisz program ktory sprawdzi czy dana liczba wystepuje w tablicy

        int[] tab8 = {43,53,27,23};
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj sprawzana liczbe");
        int liczba = scanner.nextInt();
        for (int i  = 0; i <= tab8.length - 1 ; i++){
            System.out.println("powtorzenie " + (i + 1));
            if (tab8[i] == liczba){
                System.out.println("liczba wystepuje");
                break;
            }
        }

    }
}
