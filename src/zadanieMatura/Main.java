package zadanieMatura;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("dane.txt"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int w = scanner.nextInt();
        int liczba = w^2;
        String s = String.valueOf(liczba);
        Map<Integer,Integer> mapa = new HashMap<>();
        int zliczanie=0;
        for (int i = s.length() - 1; i > 0; i--) {
            int a = Integer.parseInt(s.substring(0, i));
            int b = Integer.parseInt(s.substring(i));
            if(a+b<=w){
                zliczanie++;
            }
            mapa.put(w,zliczanie);
        }
        for (Map.Entry<Integer,Integer>  e : mapa.entrySet()
             ) {
            System.out.println(e.getKey()+ " " + e.getValue());

        }
        int klucz = 0;
        int  max = Collections.max(mapa.values());
        for (Map.Entry<Integer,Integer> e :mapa.entrySet()) {
            if(e.getValue()== max){
                klucz = e.getKey();
            }
        }
        System.out.println(klucz +" "+max);


    }
}
