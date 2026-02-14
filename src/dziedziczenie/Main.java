package dziedziczenie;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Uczen> listaUczniow= new ArrayList<>();
        Map<String,Uczen> mapaUczniow= new HashMap<>();
        System.out.println("ilu uczniow chcesz dodac");
        int n =scanner.nextInt();
        scanner.nextLine();
        for (int i = 0;i<n;i++){
            System.out.println("imie");
            String imie = scanner.nextLine();
            System.out.println("nazwisko");
            String nazwsiko = scanner.nextLine();
            System.out.println("ocena");
            int ocena = scanner.nextInt();
            scanner.nextLine();
            Uczen u = new Uczen(imie,nazwsiko,ocena);
            listaUczniow.add(u);
            }
        for (Uczen u :listaUczniow) {
        mapaUczniow.put(u.nazwisko,u);
        u.wyswietl();
        }




    }
}
