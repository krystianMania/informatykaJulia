package Matura2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("skrot2.2024.txt"));
        FileWriter fw = new FileWriter("wynik3.3.txt");
        String linia;
        while ((linia = br.readLine()) != null){
            linia = linia.replaceAll("\\n+","");
            String nieParzystSkrot= linia.replaceAll("[24680]","");
            Long liczba = Long.parseLong(linia);
            Long nieParzystSkrot1 = Long.parseLong(nieParzystSkrot);
            Long NWD = NWD(liczba,nieParzystSkrot1);
            if (NWD == 7){
                fw.write(linia + "\n");
            }

        }
        fw.close();
        br.close();
    }
    public static  Long NWD(Long a, Long b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(b==0)return a;
        return NWD(b,a%b);
    }
}
