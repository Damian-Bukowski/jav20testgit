package PackageTablice;

public class RozgrzewkaTablice1 {
    public static void main(String[] args) {
        int n = 10;
        int i;
        int tablica[] = new int[n];
        for (i = 0; i < tablica.length; i++) {
            tablica[i] = i;
            System.out.print(tablica[i]);
        }
    }

    }
