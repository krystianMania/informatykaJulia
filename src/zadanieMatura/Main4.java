package zadanieMatura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {
        String tekst ="n|.m&V.k/YFSF:cwg'hqpiDF^%Jh!^CmV577050221(X-IIKljxx/$gPiZ^nIoJb500000055050Phzr=qmj,HpTvcIZ]jMu%ie[[^S303004411/$>gZ)?dU_fy{]c,R<DrVzBJ/!S+\\503306140017xQLDCQiz)<BUBAXQxMv$WJL=o\"k)]$Kg\\FwIfhhuH)*Hnf%";
        String nowy = tekst.replaceAll("[^0-9]"," ");
        //zaminia milon niewiadomo ile spacji na tylko jedna
        String nowy1 = nowy.replaceAll("\\s+"," ").trim();
        String[] tablicaNumerow = nowy1.split(" ");
        Map<String,Integer> mapa = new HashMap<>();
        int liczbaWystapien = 1;
        for (String w :tablicaNumerow){
            String pierwsza = w.substring(0,1);
            if(w.length()==9 && pierwsza.equals("5")) {
                System.out.println(w);
            }
        }
        System.out.println("----------");
        for (String e :tablicaNumerow){
            String pierwsza = e.substring(0,1);
            if(e.length()==9 && pierwsza.equals("5")){
                if(mapa.containsKey(e)){
                    liczbaWystapien = mapa.get(e);
                    liczbaWystapien++;
                    mapa.put(e,liczbaWystapien);
                }else {
                    mapa.put(e,liczbaWystapien);
                }

                }
            }
        for (Map.Entry<String,Integer> e : mapa.entrySet()) {
            System.out.println(e.getKey() + " "+ e.getValue());

        }
    }
}
