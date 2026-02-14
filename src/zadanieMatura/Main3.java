package zadanieMatura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) throws IOException {
        String tekst = "fs@dx+cd52505050VfF^&x5%^&^%#&^%&#%^&^5$%^$%^%@5^%@$&^&*^^&52";
        //String tekst1 = new BufferedReader(new FileReader("dane.txt"));
        String nowy = tekst.replaceAll("[^0-9]"," ");
        String [] tablica = nowy.split(" ");
        Map<String,Integer> mapa = new HashMap<>();
        int liczbaWystapien =1;
        for (String e :tablica) {
            if(!e.isEmpty()){
                if(mapa.containsKey(e)){
                    liczbaWystapien++;
                    mapa.put(e,liczbaWystapien);
                }else {
                    mapa.put(e,1);
                }
            }
        }
        for (Map.Entry<String,Integer> e: mapa.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
