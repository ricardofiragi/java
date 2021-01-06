import java.util.Scanner;

public class tabuadaFor{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Digite o numero para calcular a tabuada:  ");
        numero = teclado.nextInt();

        for (int contador = 1; contador <= 10; contador++){
            System.out.println(numero + " X " + contador + " = " + (contador * numero));
        }
    }
}