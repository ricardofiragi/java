import java.util.Scanner;

public class tabuadaDoWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero, contador = 1;
        System.out.println("Digite o numero para calcular a tabuada:  ");
        numero = teclado.nextInt();

        do {
            System.out.println(numero + " X " + contador + " = " + (contador * numero));
            contador++; //contador = contador + 1;
        }
        while (contador <= 10);   
    }
}