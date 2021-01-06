import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num;
        num = teclado.nextInt();
                
        for (int impar = 1; impar <= num; impar = impar + 2){
            System.out.println(impar);
        }
    }
}