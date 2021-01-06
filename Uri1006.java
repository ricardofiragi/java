import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, MEDIA;

        //entrada
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        //processamento
        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

        //saída
        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}