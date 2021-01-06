import java.util.Scanner;
// leitura de teclado, precisamos de um componente Scanner

public class Leitura{
    public static void main(String args[]) {

    //Declarar um componente (uma variável) do tipo scanner
    Scanner teclado;
    //Indicar que o Scanner vai ler o teclado
    teclado = new Scanner(System.in);

    int a;
    double b;

    System.out.println("por favor digite um valor inteiro");
    a = teclado.nextInt();
    System.out.println("por favor digite um valor real");
    b = teclado.nextDouble();

    System.out.println("vc digitou os valores " + a + " e " + b);

    }
    
}