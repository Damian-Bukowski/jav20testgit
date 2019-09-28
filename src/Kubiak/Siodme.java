package Kubiak;

import java.util.Scanner;

public class Siodme {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        float x,
              y,
              suma,
              roznica,
              iloczyn,
              iloraz;
        System.out.println("Podaj Pierwsza Liczbe");
        x = scan.nextFloat();
        System.out.println("Podaj Druga Liczbe");
        y = scan.nextFloat();

        suma = x + y;
        roznica = x - y;
        iloczyn = x * y;
        iloraz = x / y;


        System.out.println("Suma liczby " + x + " i " + y + " Wynosi " + suma );
        System.out.println("Roznica liczby " + x + " i " + y + " Wynosi " + roznica );
        System.out.println("Iloczyn liczby " + x + " i " + y + " Wynosi " + iloczyn );
        System.out.println("Iloraz liczby " + x + " i " + y + " Wynosi " + iloraz );


    }
}
