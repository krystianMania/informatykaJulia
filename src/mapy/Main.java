package mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Operacja	Sposób w Javie	Uwagi
        Dodanie nowego wpisu	map.put(key, value)	Nadpisuje, jeśli klucz już istnieje
        Pobranie wartości	map.get(key)	Zwraca null jeśli brak klucza
        Sprawdzenie klucza	map.containsKey(key)	true/false
        Sprawdzenie wartości	map.containsValue(value)	true/false
        Usunięcie wpisu	map.remove(key)	Usuwa parę klucz-wartość
        Aktualizacja wartości	map.put(key, newValue) lub compute	Przydatne np. do liczenia sum
         */
        Map<String, Integer> oceny = new HashMap<>();
        oceny.put("Mania", 2);
        oceny.put("zalecka", 6);
        oceny.put("zalecka", 5);

        boolean jestmania = oceny.containsKey("Mania");
        System.out.println(jestmania);

        boolean istniejeocena = oceny.containsValue(5);
        System.out.println(istniejeocena);

        oceny.remove("Mania");

        oceny.put("zalecka", oceny.get("zalecka") + 1);

        for (Map.Entry<String, Integer> entry : oceny.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<String, Integer> oceny2 = new HashMap<>();
        oceny2.put("kurwa", 1);
        oceny2.put("szmata", 3);
        oceny2.put("dziwka", 4);
        oceny2.put("szon", 5);
        oceny2.put("niewnglik", 6);
        oceny2.put("piotr", 2);
        oceny2.put("ala", 3);
        oceny2.put("jan", 4);
        oceny2.put("jan", 5);
        oceny2.remove("ala");
        for (Map.Entry<String, Integer> entry1 : oceny2.entrySet()) {
            System.out.println(entry1.getKey() + ": " + entry1.getValue());
        }
        //zadanie dwa
        String zdanie = "ala ma kota i kot ma alę";
        String[] slowa = zdanie.split(" ");

        Map<String, Integer> licznik = new HashMap<>();

        for (String slowo : slowa) {
            if (licznik.containsKey(slowo)) {
                licznik.put(slowo, licznik.get(slowo) + 1);
            } else {
                licznik.put(slowo, 1);
            }
        }

        for (Map.Entry<String,Integer> entry2: licznik.entrySet()) {
            System.out.println(entry2.getKey() + " " + entry2.getValue());

        }
        System.out.println("--------------");

        //zadanie 3
        Map<String,Integer> produkty = new HashMap<>();
        produkty.put("mleko",3);
        produkty.put("chleb",2);
        produkty.put("jajka",5);
        produkty.put("maslo",6);
        produkty.put("szynka",1);
//        for (Map.Entry<String,Integer> entry4 : produkty.entrySet()) {
//            if (produkty.get(entry4.getValue()) >= 4){
//                produkty.remove(entry4);
//            }
//        }
        for (Map.Entry<String,Integer> entry6474 : produkty.entrySet()) {
            System.out.println(entry6474.getKey() + " " + entry6474.getValue());
        }

        produkty.entrySet().removeIf(entry -> entry.getValue()>=4);
        System.out.println(produkty);



        System.out.println("---------------------------------------");
        Scanner scanner2 = new Scanner(System.in);
        Map<String, Double> mozliwosci = new HashMap<>();

        mozliwosci.put("1", 1.0);
        mozliwosci.put("1+", 1.5);
        mozliwosci.put("2-", 1.75);
        mozliwosci.put("2", 2.0);
        mozliwosci.put("2+", 2.5);
        mozliwosci.put("3-", 2.75);
        mozliwosci.put("3", 3.0);
        mozliwosci.put("3+", 3.5);
        mozliwosci.put("4-", 3.75);
        mozliwosci.put("4", 4.0);
        mozliwosci.put("4+", 4.5);
        mozliwosci.put("5-", 4.75);
        mozliwosci.put("5", 5.0);
        mozliwosci.put("5+", 5.5);
        mozliwosci.put("6-", 5.75);
        mozliwosci.put("6", 6.0);

        double n = 0;
        double suma7 = 0;

        while (true) {

            System.out.println("podaj ocene z zakresu 1-6 jesli bedzie na inna program zakonczy wyliczanie z nich sredniej");
            String ocena = scanner2.next();
            boolean czyJestWOceny = mozliwosci.containsKey(ocena);
            if (czyJestWOceny == true) {
                double a = mozliwosci.get(ocena);
                suma7 += a;
                n++;
            }
            if (czyJestWOceny == false) {
                System.out.println("koncze liczenie sredniej");
                break;
            }}
        double srednia = (suma7 / n);
        System.out.println("Twoja srednia to: " + srednia);


    }
}
