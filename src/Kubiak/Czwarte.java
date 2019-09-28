package Kubiak;

import java.util.Scanner;

//Napisz program który oblicza objetość kuli o promienu r. Wartosc promienia wprowadzamy z klawiatury
//W programie nalezy przyjac ze zmienne promien r i objetosc sa typu double (rzeczywistego).
//Dla tych zmiennych nalezy przyjac format wyswietlania na ekranie z dokladnoscia do dwoch miejsc po przecinku.
public class Czwarte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double promienR;
        double wzor;
        System.out.println("Wprowadz promien kola");
        promienR = scan.nextDouble();
        double a;
        wzor = (4 * Math.PI * promienR* promienR *promienR / 3);
        a = Math.PI;
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(4);
        df.setMinimumFractionDigits(2);
        System.out.println(df.format((double) wzor));

        //cos chyba zle ale ok
    }
}
