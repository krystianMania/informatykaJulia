package DziedziczenieZadanieDwa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        List<PracownikFirmy> pracowicy= new ArrayList<>();
        Map<String,PracownikFirmy> mapa= new HashMap<>();
        System.out.println("ile ppracownikow chcesz dodac");
        int liczbaPracownikow = scanner1.nextInt();
        scanner1.nextLine();
        for (int i=0;i<liczbaPracownikow;i++){
            System.out.println("imie");
            String imie = scanner1.nextLine();
            System.out.println("nazwisko");
            String nazwisko = scanner1.nextLine();
            System.out.println("stanowisko");
            String stanowisko = scanner1.nextLine();
            System.out.println("zarobki");
            int zarobki = scanner1.nextInt();
            scanner1.nextLine();
            PracownikFirmy pracus = new PracownikFirmy(imie,nazwisko,stanowisko,zarobki);
            pracowicy.add(pracus);

            }
        for ( PracownikFirmy p :pracowicy) {
        mapa.put(p.stanowisko,p);
        p.wieceNiz5k();}

    }
}
