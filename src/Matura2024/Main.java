package Matura2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("skroty2024.txt"));
        FileWriter fw = new FileWriter("wynik3.2.2024.txt");
        String linia;
        int licz = 0;
        List<Long> parzyste = new ArrayList<>();
        List<Long> nieparzystySkrot = new ArrayList<>();
        while ((linia = br.readLine()) != null){
            linia = linia.replaceAll("\\n+","");
                if(linia.matches("[02468]+")){
                    Long linia1 = Long.parseLong(linia);
                    parzyste.add(linia1);
                    licz++;
                }else{
                    String skrot = linia.replaceAll("[02468]","");
                    Long skrot1 = Long.parseLong(skrot);
                    nieparzystySkrot.add(skrot1);
                }
            }

        fw.write("liczb ktore nie maja skrotu jest: " + licz + "\n");
        Long max = Collections.max(parzyste);
        for (Long e :parzyste) {
            if(max.equals(e)) {
                fw.write(e + "\n");
            }
        }
        fw.close();
        br.close();
    }
}
