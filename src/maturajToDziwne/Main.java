package maturajToDziwne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("symbole.txt"));
        FileWriter fw = new FileWriter("wynik2.1.txt");
        String linia;
        while ((linia = br.readLine()) != null){
            String tekst = linia;
            String odwrocony = new StringBuilder(tekst).reverse().toString();
            if (tekst.equals(odwrocony)){
                fw.write(tekst + "\n");
            }
        }
        fw.close();
        br.close();

    }
}
