
/*
    Soukaina Salam - S331419
    Zarina Iljasova - S311806
 */

import java.util.NoSuchElementException;

public class oblig1 {

    //Oppgave 1

    public static int maks(int[] a){
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen er tom!");

        int maksVerdi = 0;

        for(int j = 0; j < a.length -1 ; j++){

            if(a[j] > a[j+1]) {
                maksVerdi = a[j];
                a[j] = a[j + 1];
                a[j + 1] = maksVerdi;

            }

        }

        return a[a.length - 1];
    }

    public static void main(String[] args){
        int [] a = {1,2,3,4,5};

        System.out.println(oblig1.maks(a));
        System.out.println(oblig1.ombyttinger(a));
        System.out.println(oblig1.antallUlikeSortert(a));
    }


    public static int ombyttinger(int[] a) {


        int ombytt = 0;
        if (a.length < 1)
            throw new NoSuchElementException("Tabellen er tom");

        for (int j = 0; j < a.length - 1; j++) {
            if (a[j + 1] > a[j]) {
                int maksVerdi = a[j + 1];
                a[j + 1] = a[j];
                a[j] = maksVerdi;
                ombytt++;
            }
        }
        return ombytt;
    }

    //Oppgave 2
    public static int antallUlikeSortert(int[] a){
        //sjekker om a er sortert stigende
        int x = 0;
        int antall = 0;

        for (int j = 0; j < a.length ; j++){
            if ( a[j] >= x){
                if (a[j]!= x){
                    antall++;
                }
                x = a[j];
            }
            else{

                throw new IllegalStateException("Tabellen a er ikke sortert  på en stigende måte");
            }
        }
        return antall;
        //returner antall ulike verdier
    }



}


