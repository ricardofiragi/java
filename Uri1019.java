import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int segundos, h, m, s;
        
        //entrada
        segundos = teclado.nextInt();
        
        //processamento
        h = segundos/3600;
        m = (segundos % 3600) / 60;
        s = (segundos % 3600) % 60;

        //saída
        System.out.println(h + ":" + m + ":" + s);        
        }
}