package Kubiak;

import java.util.Scanner;

//Napisz program ktory obliczy pole prostokata. Wartosc bokow a i b wyprowadzamy z klawiatury. W programie nalezy przyjac
// ze zmienne a i b sa typu double (rzeczywistego)
public class Pierwsze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double
                a,
                b,
            pole;
        System.out.println("Podaj dlugosc boku a :");
        a = scan.nextDouble ();
        System.out.println("Podaj dlugosc boku b :");
        b = scan.nextDouble ();
        pole = a*b;
        System.out.println("Pole Prostokata o boku a: " + a );
        System.out.println("Pole Prostokata o boku b: " + b );
        System.out.println("Wynosi : " + pole);

    }
}
