import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float num;
        int par = 0;
        
        for (int contador = 1; contador <= 5; contador++){
            num = teclado.nextFloat();
            if (num % 2 == 0) {
                par++;
            }
        }
        System.out.println(par + " valores pares");
    }
}