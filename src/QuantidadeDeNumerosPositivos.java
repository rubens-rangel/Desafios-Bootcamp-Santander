import java.io.IOException;
import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int positivos = 0;
        System.out.print(" Escreva seis valores: ");
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        double d = leitor.nextDouble();
        double e = leitor.nextDouble();
        double f = leitor.nextDouble();


        if (a > 0) { positivos++;}
        if (b > 0) { positivos++;}
        if (c > 0) { positivos++;}
        if (d > 0) { positivos++;}
        if (e > 0) { positivos++;}
        if (f > 0) { positivos++;}

        System.out.print(positivos);
        System.out.print(" valores positivos");
    }
}
