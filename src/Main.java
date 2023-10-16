/* Napisz program, który sortuje n liczb w tablicy, utwórz 3 metody czytaj_dane, przetworz_dane, wyswietl_wynik
    wszystkie metody mają przyjmować parametry int [] liczby, int n, wartość n ma zostać odgólnie narzucona,
    ale łatwa do zmienienia, wartości w tablicy nadaj randomowo z zakresu 0-99


 */
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int [] liczby = new int[n];
        Sortowanie sortowanie = new Sortowanie();
        sortowanie.czytaj_dane(liczby, n);
        System.out.println("Przed posortowaniem");
        sortowanie.wyswietl_wynik(liczby, n);
        sortowanie.przetworz_dane(liczby, n);
        System.out.println("Po posortowaniu");
        sortowanie.wyswietl_wynik(liczby, n);
    }
}