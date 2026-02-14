package maturajToDziwne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("symbole.txt"));
        FileWriter fw = new FileWriter("wynik2.3.txt");
        String linia;
        String tekst;
        List<Long> liczby= new ArrayList<>();
        while ((linia = br.readLine()) != null){
            tekst = linia.replaceAll("o","0");
            tekst = tekst.replaceAll("[+]","1");
            tekst = tekst.replaceAll("[*]","2");
            BigInteger trojkowy = new BigInteger(tekst,3);
            String dzisietny = trojkowy.toString(10);
            Long nowa = Long.valueOf(dzisietny);
            liczby.add(nowa);
        }
        Long max = Collections.max(liczby);
        for (long e :liczby) {
            if (max.equals(e)){
                String noweE = String.valueOf(e);
                BigInteger dziesietny1 = new BigInteger(noweE,10);
                String trojkowy1 = dziesietny1.toString(3);
                String teskst1 = trojkowy1.replaceAll("0","o");
                teskst1 = teskst1.replaceAll("1","+");
                teskst1 = teskst1.replaceAll("2","*");
                fw.write(e + " " + teskst1);
            }
        }
        fw.close();
        br.close();
    }
}
