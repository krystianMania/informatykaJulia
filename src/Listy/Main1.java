package Listy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("pesel.txt"));
        FileWriter fw = new FileWriter("wynik3.txt");
        String linia;
        List<String> lista = new ArrayList<>();
        while ((linia = br.readLine()) != null){
            lista.add(linia);
        }
        for (String e:lista) {
            if (e.startsWith("9")){
                 fw.write(e + "\n");
            }
        }
        fw.close();
        br.close();

    }
}
