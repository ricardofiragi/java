import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float num;
        int positivo = 0;
        
        for (int contador = 1; contador <= 6; contador++){
            num = teclado.nextFloat();
            if (num >= 0) {
                positivo++;
            }
        }
        System.out.println(positivo + " valores positivos");
    }
}