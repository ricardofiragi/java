import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n;
        n = teclado.nextInt();
                                
        for (int contador = 1; contador <= n; contador++){
            quadrado = contador * contador;

            switch(n){
            case (n == 0):
                System.out.println("NULL");
                break;

            case (n > 0 && n % 2 != 0):
                System.out.println("ODD POSITIVE");
                break;
            
            case (n < 0 && n % 2 != 0):
                System.out.println("ODD NEGATIVE");
                break;
            
            case (n > 0 && n % 2 == 0):
                System.out.println("EVEN POSITIVE");
                break;
            
            case (n < 0 && n % 2 == 0):
                System.out.println("EVEN NEGATIVE");
                break;
            }
        }
    }
}