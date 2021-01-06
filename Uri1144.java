import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x, y;
        x = teclado.nextInt();
        y = teclado.nextInt();

        if (x % y == 0 || y % x == 0) {            
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }
    }
}