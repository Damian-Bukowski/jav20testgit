package Algorytmy;

import java.util.Scanner;

public class Zd1nr2 {
    public static int sumaLiczb(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();
        System.out.println("Suma liczb a i b to: " + sumaLiczb(a, b));
    }
}
