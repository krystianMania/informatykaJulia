package Listy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();
        liczby.add(2);
        liczby.add(2);
        liczby.add(2);
        liczby.add(3);
        liczby.add(1);
        liczby.add(0);
        liczby.add(8);
        liczby.add(1);
        liczby.add(2);
        liczby.add(2);
        liczby.add(2);
        System.out.println(liczby);
        liczby.set(0, 9);
        System.out.println(liczby);
        liczby.remove(5);
        System.out.println(liczby);
        liczby.remove((Integer) 2);
        System.out.println(liczby);
        liczby.replaceAll(x -> x == 2 ? 0 : x);
        System.out.println(liczby);
        Collections.sort(liczby);
        System.out.println(liczby);
        Collections.reverse(liczby);
        System.out.println(liczby);
        int pierwszy = liczby.get(0);
        System.out.println(pierwszy);

        List<String> sas = List.of("sasdasdsa", "fdsffs");
        Set<String> set = new HashSet<>();
        set.add("cos");
        set.add("cos");

        Set<Integer> zbiorLiczb = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> liczby1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println(liczby1);

        liczby1.add(6);
        System.out.println(liczby1);

        liczby1.remove((Integer) 2);
        System.out.println(liczby1);

        boolean czyTrzy = liczby1.contains(3);
        System.out.println(czyTrzy);

        Set<Integer> A = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> B = new HashSet<>(Arrays.asList(3,4,5,6));

        //czesc wspolna
        Set<Integer> wspolna = new HashSet<>(A);
        wspolna.retainAll(B);
        System.out.println(wspolna);
        // suma
        Set<Integer> suma = new HashSet<>(
    }

}
