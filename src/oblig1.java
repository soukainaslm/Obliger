public class oblig1 {
    public static int maks(int[] a) // a er en heltallstabell
    {
        if (a.length < 1) {


         throw new java.util.NoSuchElementException("Tabellen a er tom!");
        }

        int m = 0;  // indeks til foreløpig største verdi

        for (int i = 1; i < a.length; i++)  // obs: starter med i = 1
        {

            if (a[i] > a[m]) m = i;  // indeksen oppdateres

        }

        return m;  // retuadfjkhbrnerer indeksen/posisjonen til største verdi

    }  // maks a

}

