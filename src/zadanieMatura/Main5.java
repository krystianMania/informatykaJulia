package zadanieMatura;

import javax.swing.*;
import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        String tekst = "n|.m&V.k/YFSF:cwg'hqpiDF^%Jh!^CmV577050221(X-IIKljxx/$gPiZ^nIoJb500000055050Phzr=qmj,HpTvcIZ]jMu%ie[[^S303004411/$>gZ)?dU_fy{]c,R<DrVzBJ/!S+\\503306140017xQLDCQiz)<BUBAXQxMv$WJL=o\"k)]$Kg\\FwIfhhuH)*Hnf%\n";
        String nowy = tekst.replaceAll("[^0-9]"," ");
        //zaminia milon niewiadomo ile spacji na tylko jedna
        String nowy1 = nowy.replaceAll("\\s+"," ").trim();
        String[] tablica = nowy1.split(" ");
        List<String> lista = new ArrayList<>();
        for (String w :tablica){
            if(w.length()==9 ) {
                lista.add(w);
            }
        }
        Map<String,Set<String>> numerIUnikaty = new HashMap<>();

        for (int i=0;i < lista.size() ;i++ ){
            Set<String> zbior = new HashSet<>();
            String numer = lista.get(i);
            for (char e  :numer.toCharArray()) {
                zbior.add(String.valueOf(e));
            }
            //int a=zbior.size();
            numerIUnikaty.put(lista.get(i),zbior);
        }
        //int min = Collections.min(numerIUnikaty.values());

        //for (Map.Entry<String,Integer> x :  numerIUnikaty.entrySet()) {
            //if (x.getValue() == min){
              //  System.out.println(x.getKey() + " " + x.getValue());
        //    }
       // }
        for (Map.Entry<String,Set<String>> k : numerIUnikaty.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }




    }
}
