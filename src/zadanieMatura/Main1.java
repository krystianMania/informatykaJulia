package zadanieMatura;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        String tekst = "fs@dx+cd50450505VfF^&x50";
        String tekst1 = tekst.replaceAll("[^0-9]"," ");
        String[] tablica = tekst1.split(" ");
        int licz = 0;
        for (String e :tablica) {
            if(!e.isEmpty()){
                String poczatek = e.substring(0,2);
                if(poczatek.equals("50")){
                    licz++;
                }
            }
        }
        System.out.println(licz);

    }
}
