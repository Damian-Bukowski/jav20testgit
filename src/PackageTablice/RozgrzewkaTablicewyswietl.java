package PackageTablice;

public class RozgrzewkaTablicewyswietl {
    public static void main(String[] args) {
        int n = 10;
        int i;
        int tablica[] = new int[n];
        for (i = 0; i < tablica.length; i++) {
            tablica[i] = n-1 - i;
            System.out.print(tablica[i] + " ");
        }
    }

}
