package maturajToDziwne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("symbole.txt"));
        FileWriter fw = new FileWriter("wynik2.2.txt");
        String linia;
        String wiersz1;
        String wiersz2;
        String wiersz3;
        Map<Integer, Integer> mapa = new HashMap<>();
        int ile = 0;
        char znak;
        List<String> symbole = new ArrayList<>();
        while ((linia = br.readLine()) != null) {
            symbole.add(linia);
        }
        for (int i = 0; i < symbole.size() - 2; i++) {
            wiersz1 = symbole.get(i);
            wiersz2 = symbole.get(i + 1);
            wiersz3 = symbole.get(i + 2);
            for (int j = 0; j < wiersz1.length() - 2; j++) {
                znak = wiersz1.charAt(j);
                if (
                        znak == wiersz1.charAt(j) &&
                                znak == wiersz1.charAt(j + 1) &&
                                znak == wiersz1.charAt(j + 2) &&

                                znak == wiersz2.charAt(j) &&
                                znak == wiersz2.charAt(j + 1) &&
                                znak == wiersz2.charAt(j + 2) &&

                                znak == wiersz3.charAt(j) &&
                                znak == wiersz3.charAt(j + 1) &&
                                znak == wiersz3.charAt(j + 2)
                ) {
                    ile++;
                    int wiersz = i + 2;
                    int pozycja = j + 2;
                    mapa.put(wiersz, pozycja);
                }
            }
        }
        fw.write(ile + " ");
        for (Map.Entry<Integer, Integer> e : mapa.entrySet()) {
            fw.write(e.getKey() + " " + e.getValue() + " ");
        }
        fw.close();
        br.close();
    }
}
