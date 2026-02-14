package zpaisIOdczyt;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Zapis i odczyt danych z pliku, File, FileWriter, BufferedReader oraz odczytywanie pliku za pomoca scannera ;)

        // Przy pomocy scannera
        // Scanner odczyt = new Scanner(new File(nazwaPliku))
        // String tekst = odczyt.nextLine();

        // File
        // Klasa File w Java reprezentuje ścieżkę do pliku lub katalogu w systemie plików.
        // Możesz jej użyć do operacji na plikach, takich jak sprawdzanie istnienia pliku, uzyskiwanie informacji o pliku, tworzenie/usuwanie plików itp.

        // File plik = new File(nazwapliku);
        // Scanner in = new Scanner(plik);

        // FileWriter
        // Klasa FileWriter w Java służy do zapisywania danych tekstowych do pliku. Możesz utworzyć obiekt FileWriter,
        // który odnosi się do określonego pliku i zapisuje tekst do niego.
        // Musisz pamiętać, że ta klasa nie jest zalecana do zapisywania dużych ilości danych, ponieważ nie jest zoptymalizowana pod kątem wydajności.

        //              nazwa
        // FileWriter fileWriter = new FileWriter(plik) // dodajemy to co zapiszemy w nawiasie do pliku ktory mamy zapisany pod nazwa plik
        // fileWriter.write("aksasksdskd");

        // BufferedReader
        // Klasa BufferedReader jest używana do odczytywania danych z pliku tekstowego w sposób efektywny i wydajny.
        // Pomaga uniknąć częstego dostępu do dysku poprzez buforowanie danych. Odczytuje dane w większych porcjach, co przyspiesza proces odczytu.

        //                    nazwa
        // BufferedReader bufferedReader = new BufferedReader(new FileReader(nazwaPliku))
//
//        BufferedReader br = new BufferedReader(new FileReader("plik1.txt"));
//        FileWriter fw = new FileWriter("odp.txt");
//        //petla do odczytu
//        String linia;
//        while((linia = br.readLine()) != null){
//            //jakas logika ze np zapisuje do pliku
//            fw.write(linia + "\n");
//        }
//
//
//
//        fw.close();
//        br.close();
//
//        BufferedReader br = new BufferedReader(new FileReader("plik3.txt"));
//        FileWriter fw = new FileWriter("odp3.txt");
//        String lina;
//        while ((lina = br.readLine()) != null){
//        String nowa = lina.replaceAll("[0-9]","");
//        fw.write(nowa + "\n");
//        }
//        fw.close();
//        br.close();
//        BufferedReader br = new BufferedReader(new FileReader("plik4.txt"));
//        FileWriter fw = new FileWriter("odp4.txt");
//        String lina;
//        while ((lina = br.readLine()) != null){
//            if(lina.length()==10){
//                fw.write(lina + "\n");
//            }
//        }
//        fw.close();
//        br.close();
//        BufferedReader br = new BufferedReader(new FileReader("plik5.txt"));
//        FileWriter fw = new FileWriter("odp5.txt");
//        String lina;
//        while ((lina = br.readLine()) != null){
//          if (lina.contains("ABC")){
//              fw.write(lina + "\n");
//          }
//        }
//        fw.close();
//        br.close();
//        BufferedReader br = new BufferedReader(new FileReader("plik6.txt"));
//        FileWriter fw = new FileWriter("odp6.txt");
//        String lina;
//        int policz;
//        int suma = 0;
//        while ((lina = br.readLine())!= null){
//            policz = lina.length();
//            suma += policz;
//        }
//        fw.write(String.valueOf(suma));
//        fw.close();
//        br.close();
//        BufferedReader br = new BufferedReader(new FileReader("plik7.txt"));
//        FileWriter fw = new FileWriter("odp7.txt");
//        String linia;
//        int suma = 0;
//        char szukana = 'A';
//        while ((linia = br.readLine()) != null){
//            for (char e: linia.toCharArray()) {
//                if (szukana == e){
//                    suma++;
//                }
//            }
//        }
//        fw.write(String.valueOf(suma));
//        fw.close();
//        br.close();
        BufferedReader br = new BufferedReader(new FileReader("plik8.txt"));
        FileWriter fw = new FileWriter("odp8.txt");
        String linia;

        while ((linia = br.readLine()) != null){
            if(linia.matches("[a-zA-Z]+")){
                fw.write(linia + "\n");
            }
        }
        fw.close();
        br.close();




    }
}
