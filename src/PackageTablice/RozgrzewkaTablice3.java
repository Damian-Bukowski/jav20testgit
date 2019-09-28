package PackageTablice;

import java.util.Random;

public class RozgrzewkaTablice3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int i;
        int tablica[] = new int[n];
        for (i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(10);
            System.out.print(tablica[i]);
        }
    }

}

