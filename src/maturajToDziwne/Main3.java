package maturajToDziwne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("symbole.txt"));
        FileWriter fw = new FileWriter("wynik2.4.txt");
        String linia;
        String tekst;
        long suma = 0;
        while ((linia = br.readLine()) != null){
            tekst = linia.replaceAll("o","0");
            tekst = tekst.replaceAll("[*]","2");
            tekst = tekst.replaceAll("[+]","1");
            BigInteger nowe = new BigInteger(tekst,3);
            String dziesietny = nowe.toString(10);
            long cyfry = Long.parseLong(dziesietny);
            suma += cyfry;
        }
        fw.write(suma + " ");
        String nowaSuma = String.valueOf(suma);
        BigInteger dziesoetny1 = new BigInteger(nowaSuma,10);
        String trojkowy1 =  dziesoetny1.toString(3);
        trojkowy1 = trojkowy1.replaceAll("0","o");
        trojkowy1 = trojkowy1.replaceAll("2","*");
        trojkowy1 = trojkowy1.replaceAll("1","+");
        fw.write(trojkowy1);
        fw.close();
        br.close();
    }
}
