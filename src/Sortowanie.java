import java.util.Random;

public class Sortowanie {



    public void czytaj_dane(int [] liczby, int n)
    {

        Random random = new Random();
        for ( int i = 0 ; i < n ; i++)
        {
            liczby[i] = random.nextInt(100);

        }


    }

    public void przetworz_dane(int [] liczby, int n)
    {
        for (int i = 1; i <= n -1 ; i++) {
            for (int j = n -1; j >= i; --j) {
                if (liczby[j -1] > liczby[j]) {
                    int temp = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = temp;
                }
            }
        }
    }


    public void wyswietl_wynik(int [] liczby, int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.println(liczby[i]);
        }
    }

}
