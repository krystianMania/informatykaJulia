package mapy;

import java.util.HashMap;
import java.util.Map;

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



    }
}
