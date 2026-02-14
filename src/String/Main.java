package String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String tekst = "Ala ma kota";
        String nowy = tekst.replaceAll("a","*");
        System.out.println(nowy);
        BufferedReader br = new BufferedReader(new FileReader("alaMaKot.txt"));
        FileWriter fw = new FileWriter("wynikala.txt");
        String linia;
        int wynik=0;
        while ((linia = br.readLine()) != null){
            String[] tablica = linia.split("\\s+");
            wynik += tablica.length;
        }
        fw.write(String.valueOf(wynik));
        fw.close();
        br.close();
    }
}
