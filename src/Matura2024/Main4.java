package Matura2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("liczby2024.txt"));
        FileWriter fw = new FileWriter("wynik4.3.2024.txt");

        String wiersz = br.readLine();
        String wierszs = br.readLine();

        String [] tablica = wiersz.split("\\s+");
        String [] tablicaa = wierszs.split("\\s+");

        List<Long> wiersz1 = new ArrayList<>();
        for (String e :tablica) {
            wiersz1.add(Long.parseLong(e));
        }

        List<Long> wiersz2 = new ArrayList<>();
        for (String e :tablicaa) {
            wiersz2.add(Long.parseLong(e));
        }

        for (long calkowita:wiersz2) {
            long calkowitaa = calkowita;
            for (long pierwsza : wiersz1) {
                 if(calkowita % pierwsza == 0) {
                    calkowita = calkowita / pierwsza;
                }
            }
            if (calkowita == 1) {
                fw.write(calkowitaa +" ");
            }
        }
        fw.close();
        br.close();
    }
}
