import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float num, totalpositivos = 0;
        int positivo = 0;
        
        for (int contador = 1; contador <= 6; contador++){
            num = teclado.nextFloat();
            if (num >= 0) {
                positivo++;
                totalpositivos = totalpositivos + num;
            }
        }
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f\n", totalpositivos / positivo);
    }
}