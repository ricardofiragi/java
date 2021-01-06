import java.util.Scanner;

public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x = 0, E1 = 1, E2 = 1, E3 = 1, contador = 1;
        x = teclado.nextInt();

        while (contador <= x) {
            System.out.println(E1 +" "+ E2 +" "+ E3);
            contador++;
            E1 = contador;
            E2 = contador * contador;
            E3 = contador * contador * contador;
        }
    }
}