import java.util.Scanner;

public class Uri1015{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float x1, y1, x2, y2;
        double z, d;

        //entrada
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();

        //processamento
        z = (((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        d = Math.sqrt(z);

        //saída
        System.out.printf("%.4f%n", d);
    }
}