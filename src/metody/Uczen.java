package metody;

class Uczen {
    private String imie;
    private String nazwisko;
    private double[] oceny;

    public Uczen(String imie, String nazwisko, double[] oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public double srednia() {
        double suma = 0;
        for (double e : oceny) {
            suma += e;
        }
        return suma / oceny.length;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie(Uczen uczen) {
        return this.imie;
    }


    public void pokazDane() {
        System.out.println("imie: " + imie + "nazwisko: " + nazwisko + "srednia: " + srednia());
    }
}


