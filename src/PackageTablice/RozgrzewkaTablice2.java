package PackageTablice;

public class RozgrzewkaTablice2 {
    public static void main(String[] args) {
        int n = 10;
        int i;
        int tablica[] = new int[n];
        for (i = 0; i < tablica.length; i++) {
            tablica[i] = i;
            if (i%2 !=0){
            tablica[i] = i+ (i-1);
            }
            System.out.print("" +tablica[i]);
        }
    }

}
