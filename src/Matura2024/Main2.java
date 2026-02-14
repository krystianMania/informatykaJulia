package Matura2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("liczby2024.txt"));
        FileWriter fw = new FileWriter("wynik4.1.2024.txt");
        int licz = 0;
        String linia1 = br.readLine();
        String[] wiersz1 = linia1.split("\\s+");
        String linia2 = br.readLine();
        String[] wiersz2 = linia2.split("\\s+");
        for(int i = 0; i<wiersz1.length; i++) {
            Long dzielnik = Long.parseLong(wiersz1[i]);
            for (int j = 0; j < wiersz2.length; j++) {
                Long liczba = Long.parseLong(wiersz2[j]);
                if (liczba % dzielnik == 0) {
                    licz++;
                    break;

                }
            }
        }
        fw.write(String.valueOf(licz));
        fw.close();
        br.close();
    }
}
