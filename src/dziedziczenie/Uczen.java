package dziedziczenie;

import java.util.List;

public class Uczen extends Osoba {
    private int ocena;

    public Uczen(String imie, String nazwisko, int ocena) {
        super(imie, nazwisko);
        this.ocena = ocena;
    }

    public void wyswietl() {
        System.out.println(imie + " " + nazwisko);
        if (ocena >= 3) {
            System.out.println("Zdal");

        } else {
            System.out.println("Nie zdal");
        }
    }
}
