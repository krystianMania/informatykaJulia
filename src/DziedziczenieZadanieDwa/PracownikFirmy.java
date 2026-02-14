package DziedziczenieZadanieDwa;

public class PracownikFirmy extends Pracownik {
    protected String stanowisko;
    protected int zarobki;
    public PracownikFirmy(String imie,String nazwisko,String stanowisko,int zarobki){
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.zarobki = zarobki;
    }
    public void wieceNiz5k(){
        System.out.println("imie "+ imie + " nazwisko " +nazwisko + " stanowsiko " + stanowisko);
        if(zarobki>5000){
            System.out.println("zarabia wiecej niz 5k");
        }else{
            System.out.println("zarabia mniej niz 5k");
        }
    }
}
