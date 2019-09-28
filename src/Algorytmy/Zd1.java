package Algorytmy;

import java.util.Scanner;

public class Zd1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int     a,
                b,
                suma;

        System.out.println("Podaj liczbe a");
        a = scan.nextInt();

        System.out.println("Podaj liczbe b");
        b= scan.nextInt();

        suma = a+b;

        System.out.println("Twoja suma dwoch liczb to " + suma);

    }

}
