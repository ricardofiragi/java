import java.util.Scanner;

public class tabuadaWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero, contador;
        contador = 1;
        System.out.println("Digite o número para calcular a tabuada:  ");
        numero = teclado.nextInt();

        while (contador <= 10){
            System.out.println(numero + " X " + contador + " = " + (contador * numero));
            contador++; //contador = contador + 1;
        }

    }
}