package mapy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("slowa.txt"));
        FileWriter fw = new FileWriter("wynik.txt");
        String linia;
        int policz =1;
        List<String> lista = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        while((linia = br.readLine()) != null){
            String nowa = linia.replaceAll("\\s+","");
            lista.add(nowa);
        }
        for (String e:lista){
            if(map.containsKey(e)){
                policz++;
                map.put(e,policz);
            }else{
                map.put(e,1);
            }
        }
        for (Map.Entry<String,Integer> w: map.entrySet() ){
            fw.write(w.getKey() + " " + w. getValue() + "\n");
        }
        fw.close();
        br.close();
    }
}
