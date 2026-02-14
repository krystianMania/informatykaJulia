package Listy;

import javax.swing.event.ListDataListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main10 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("dron.txt"));
//        FileWriter fw = new FileWriter("wynik3.2.txt");
//        String linia;
//        Map<String,String> mapa = new HashMap<>();
//        while ((linia = br.readLine()) != null) {
//            linia = linia.trim();
//            String [] tablica = linia.split("\\s+");
//            mapa.put(tablica[0],tablica[1]);
//        }
//        for(int i = 0;i<mapa.size();i++) {// to jest zle tu potrzebuje tablicy 2 wymiarowych ze na jednym index 2 som cn
////           if (
////                   i tu trza ze jak pierwsza plus 3podzielona na dwa rowana sie pierwszej wspolrzednej wiersza2 && druga wsporzedna wiersza 1 plus wiersz3 podzielone na dwa rowna sie 2 wspolrzedenj 2 wiersza
////           ){
////               fw.write(wspolrzedne wiersz1 , teraz tego co jest srodkiem,wspolrzedne 3 wiersza + "\n");
////           }
//            List<List<String>> listalista = new ArrayList<>();
//        }
//
//        //tablica dwywmairtowa
//        int[][] sasa = new int[3][3];
//
//        //przypiosanie wartosci do pozycji
//        sasa[3][3] = 1;
//
//        //tablica niesy,etryczna
//
//        int[][] tabclia1 = new int[3][];
//        //podajesz numer wiersza przy nazwie tabklicy a w nim liczbe kolumn
//        tabclia1[0] = new int[4];
//        tabclia1[1] = new int[2];
//        tabclia1[2] = new int[5];
//        //przykladowy wyglad takiej tablicy
//
//        //TABLICA
//        // 3 2 3 4
//        // 2 3
//        // 9 2 5 6 7
//
//        // wierszy gora dol, kolumna lewo prawo
//
//        //dlugosc tablicy
//        int dlugoscTab = tabclia1.length;

        //dlugos wiersza
        //int dlugoscPierwszegoWiersza = tabclia1[0].length;
        Scanner scanner = new Scanner(System.in);
        int suma1 = 0;
        System.out.println("podaj liczbe wierszy wieksza od 0");
        int n = scanner.nextInt();
        System.out.println("podaj liczbe elementow kazdego z wiersza wiecej niz 0");
        int m = scanner.nextInt();
        int[][] tablica = new int[n][m];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
                System.out.println("podaj cyfre ktora chcesz dodac doa tablicy na wiersz; " + (i + 1) + " miejsce: " + (j + 1));
                tablica[i][j] = scanner.nextInt();
                suma1 += tablica[i][j];

            }
        }
        System.out.println("suma wszytskich elementow tego ciagu wynosi: " + suma1);
        System.out.println("----------------");


        int max = tablica[0][0];
        for (int[] k : tablica) {
            for (int l : k) {
                if (l > max) {
                    max = l;
                }

            }
        }
        System.out.println("max: " + max);
        System.out.println("--------------");
        int suma2 = 0;
        for (int wiersze = 0; wiersze < tablica.length; wiersze++) {
            for (int elementy = 0; elementy < tablica[0].length; elementy++) {
                suma2 += tablica[wiersze][elementy];
            }
            System.out.println(" suma wiersza: " + (wiersze + 1) + " wynosi: " + suma2);
            suma2 = 0;
        }
        System.out.println("-------------");
        int licz = 0;
        for (int wiersze1 = 0; wiersze1 < tablica.length; wiersze1++) {
            for (int elementy1 = 0; elementy1 < tablica[0].length; elementy1++) {
                if (elementy1 % 2 == 0) {
                    licz++;
                }
            }
        }
        System.out.println("tablica ma: " + licz + " parzystych liczb");
        System.out.println("-------------------");
        List<Integer> lista2 = new ArrayList<>();
        int licz2;
        for (int wiersze2 = 0; wiersze2 < tablica.length; wiersze2++) {
            licz2 = 1;
            for (int elementy2 = 0; elementy2 < tablica[0].length - 1; elementy2++) {
                if (tablica[wiersze2][elementy2] < tablica[wiersze2][elementy2 + 1]) {
                    licz2++;
                } else {
                    break;
                }
            }
            lista2.add(licz2);
            licz2 = 1;
        }
        int max2 = Collections.max(lista2);
        System.out.println("najwiekszy taki ciag sklada sie z: " + max2 + " elementow");
    }
}
