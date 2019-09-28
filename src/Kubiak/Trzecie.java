
package Kubiak;
public class Trzecie {
    public static void main(String[] args) {
        double a;
        a = Math.PI;
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(4);
        df.setMinimumFractionDigits(2);
        System.out.println(df.format((double) a));
    }
}
