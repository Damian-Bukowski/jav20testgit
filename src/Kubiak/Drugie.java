package Kubiak;
//Napisz program ktory wyswietla na ekranie komputera wartosc predefiniowanej stalej pi = 3,14...
//Nalezy przyjac format wyswietlana tej stalej z dokladnoscia do pieciu miejsc po przecinku
public class Drugie {
    public static void main(String[] args) {
        double a;
        a = Math.PI;
        java.text.DecimalFormat df=new java.text.DecimalFormat();
        df.setMaximumFractionDigits(4);
        df.setMinimumFractionDigits(2);
        System.out.println(df.format((double)a));

    }
}
