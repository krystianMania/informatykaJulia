package Listy;


import java.math.BigInteger;

public class Main8 {
    public static void main(String[] args)  {
        System.out.println(nwd(6,2));
        System.out.println(nww(6,2));


       // =========================
        // 1️⃣ Dziesiętny String → Trójkowy String
       // =========================
       String dziesietny = "2958539208";                // liczba w systemie dziesiętnym
        BigInteger liczbaDzies = new BigInteger(dziesietny, 10); // zamiana na BigInteger w bazie 10
        String trojkowy = liczbaDzies.toString(3);      // zamiana BigInteger na system trójkowy
       System.out.println("Dziesiętny: " + dziesietny + " → Trójkowy: " + trojkowy);

        // =========================
       // 2️⃣ Trójkowy String → Dziesiętny String
       // =========================
        String trojkowy2 = "021011";                     // liczba w systemie trójkowym
        BigInteger liczbaTroj = new BigInteger(trojkowy2, 3);  // zamiana na BigInteger w bazie 3
        String dziesietny2 = liczbaTroj.toString(10);      // zamiana BigInteger na dziesiętny string
        System.out.println("Trójkowy: " + trojkowy2 + " → Dziesiętny: " + dziesietny2);
        String odwrocony = new StringBuilder(trojkowy).reverse().toString(); // tak sie obraca


        //NWD




    }
    public static long nwd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) return a;
        return nwd(b, a % b);
    }
    public static long nww(long a,long b){
        return Math.abs(a * b) / nwd(a, b);
    }
}















