import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int P1, NP1, P2, NP2;
        double CP1, CP2, VALOR;

        //entrada
        P1 = teclado.nextInt();
        NP1 = teclado.nextInt();
        CP1 = teclado.nextFloat();
        P2 = teclado.nextInt();
        NP2 = teclado.nextInt();
        CP2 = teclado.nextFloat();
        
        //processamento
        VALOR = (NP1 * CP1) + (NP2 * CP2);

        //saída
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", VALOR);
    }
}