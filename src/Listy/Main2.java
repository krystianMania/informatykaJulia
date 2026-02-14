package Listy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("imiona.txt"));
        FileWriter fw = new FileWriter("wynik4.txt");
        String linia;
        List<String> pierwotna = new ArrayList<>();
        List<String> odwrotna = new ArrayList<>();
        while ((linia = br.readLine()) != null){
            pierwotna.add(linia);
        }
        int indexy = (pierwotna.size()-1);
        for (int i = indexy;i>=0;i--){
                String nowa = pierwotna.get(i);
                odwrotna.add(nowa);
        }
        for (String e:odwrotna) {
            fw.write(e + "\n");
        }
        fw.close();
        br.close();
    }
}
