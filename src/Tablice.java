import java.util.Arrays;
import java.util.OptionalInt;

public class Tablice {

    public static void main(String[] args) {
        int[] tablica = {0, 1, 2, 4, 5,7,8,10,11};
       /* int suma = Arrays.stream(tablica).sum(); //sumowanie elem tablicy








        //najwiekszy i najmniejszy element tabliocy
        int maksimum = Arrays.stream(tablica).max().getAsInt();
        int minimum = Arrays.stream(tablica).min().getAsInt();
        System.out.println("Maksimum: " + maksimum);
        System.out.println("Minimum: " + minimum);

        //średnia liczb w tablicy
        Double average = Arrays.stream(tablica).average().getAsDouble();
        System.out.println(average);

        //kopia tablicy
        int[] pierwszaTablica = {1, 2, 3, 4, 5};
        int[] kopiaTablicy = Arrays.copyOf(pierwszaTablica, pierwszaTablica.length);
*/
        /*
        //Filtrowanie tablicy
        int wartosc = 3;
        int[] przefiltrowanaTablica = Arrays.stream(tablica)
                .filter(element -> element > wartosc)
                .toArray();
        */

        //Kasowanie danych liczb z tabeli
        /*
        int elementDoUsuniecia = 3;
        int[] nowaTablica = Arrays.stream(tablica)
                .filter(element -> element != elementDoUsuniecia)
                .toArray();
        */

        // zliczanie wystąpień
        /*
        int wartosc = 2;
        long liczbaWystapien = Arrays.stream(tablica)
                .filter(element -> element == wartosc)
                .count();
        System.out.println("Liczba wystąpień " + wartosc + ": " + liczbaWystapien);

        */


        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }



    }
}
