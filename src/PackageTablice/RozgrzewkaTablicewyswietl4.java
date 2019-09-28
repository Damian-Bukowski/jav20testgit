package PackageTablice;

public class RozgrzewkaTablicewyswietl4 {
    public static void main(String[] args) {
        int n = 10;
        int i;
        int suma = 0;
        int tablica[] = new int[n];
        for (i = 0; i < tablica.length; i++) {
            tablica[i] = i;
            suma += tablica[i];
            if (i ==5){
                tablica[i] = suma + i;
            }
            System.out.print(tablica[i] + "");
        }
    }

}

