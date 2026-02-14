package mapy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("liczby.txt"));
        FileWriter fw = new FileWriter("wynik2.txt");
        String linia;
        List<String> lista = new ArrayList<>();
        Map<String,Integer> mapa = new HashMap<>();
        int policz = 1;

        while ((linia = br.readLine()) != null){
            for (char e :linia.toCharArray()) {
                lista.add(String.valueOf(e));
            }
        }
        for (String w :lista) {
            if (mapa.containsKey(w)) {
                policz = mapa.get(w);
                policz++;
                mapa.put(w, policz);
            } else {
                mapa.put(w, 1);
            }

        }
        int max = Collections.max(mapa.values());
        for (Map.Entry<String,Integer> k :mapa.entrySet()) {
            if (k.getValue() == max){
                fw.write(k.getKey() + " " + k.getValue() + "\n");
            }
        }
        fw.close();
        br.close();
    }
}
