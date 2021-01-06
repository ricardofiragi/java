import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horas, vmedia;
        double litros;

        //entrada
        horas = teclado.nextInt();
        vmedia = teclado.nextInt();

        //processamento
        litros = vmedia*horas/12.0;

        //saída
        System.out.printf("%.3f%n", litros);
    }
}