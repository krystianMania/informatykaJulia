package Listy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("dron.txt"));
        FileWriter fw = new FileWriter("wynik3.1.txt");
        String linia;
        List<Long> lista = new ArrayList<>();
        int licz = 0;
        while ((linia = br.readLine()) != null) {
            linia = linia.trim();
            String[] tablica = linia.split("\\s+");
            long a = Long.parseLong(tablica[0]);
            long b = Long.parseLong(tablica[1]);
            long wynik = nwd(a, b);
            if (wynik > 1) {
                licz++;
            }
            lista.add(wynik);
        }
        fw.write(String.valueOf(licz));
        fw.close();
        br.close();

    }

    public static long nwd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) return a;
        return nwd(b, a % b);
    }


}
