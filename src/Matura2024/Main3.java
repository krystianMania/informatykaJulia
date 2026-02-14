package Matura2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("liczby2024.txt"));
        FileWriter fw = new FileWriter("wynik4.2.2024.txt");
        String linia = br.readLine();
        String[] tablica1 = linia.split("\\s+");
        List<Long> lista = new ArrayList<>();
        for (String e :tablica1) {
            lista.add(Long.parseLong(e));
        }
        Collections.sort(lista);//od najm do najw
        Collections.reverse(lista);
        long wynik = lista.get(101);
        fw.write(String.valueOf(wynik));
        fw.close();
        br.close();

    }
}
