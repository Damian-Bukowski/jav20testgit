package PackageFigury;

public class Figura2 {
    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {
            String empty = "";
            for (int j = 1; j <= i; j++)
                System.out.print(empty + "*");
            System.out.println();
        }
    }
}

