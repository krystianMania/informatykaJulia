package Matura2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("liczby2024.txt"));
        FileWriter fw = new FileWriter("wynik4.3.2024.txt");
        String wiersz1 = br.readLine();
        wiersz1 = wiersz1.replaceAll("\n+", "");
        String[] tablica1 = wiersz1.split("\\s+");
        List<Long> wierszP = new ArrayList<>();
        Set<Long> zbior = new HashSet<>();
        for (String e : tablica1) {
            wierszP.add(Long.parseLong(e));
            zbior.add(Long.parseLong(e));
        }
        String wiersz2 = br.readLine();
        wiersz2 = wiersz2.replaceAll("\n+", "");
        String[] tablica2 = wiersz2.split("\\s+");
        List<Long> wierszD = new ArrayList<>();
        for (String e : tablica2) {
            wierszD.add(Long.parseLong(e));
        }

        for (int i = 0; i < zbior.size(); i++) {
            final long unikalna = wierszP.get(i);
            long ile = wierszP.stream().filter(x -> x.equals(unikalna)).count();
            for (long potega =0 ; potega<=ile; potega++) {
                for (int j = 0; j < wierszD.size(); j++) {
                    if ((unikalna ^ potega) == wierszD.get(j)) {
                        fw.write(String.valueOf(wierszD.get(j)));
                    }
                }
            }
            wierszP.removeIf(x -> x.equals(unikalna));
            wierszP.add(unikalna);
        }
        fw.close();
        br.close();
    }
}
