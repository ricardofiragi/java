import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int diastotal, anos, meses, dias;
        
        //entrada
        diastotal = teclado.nextInt();
        
        //processamento
        anos = diastotal / 365;
        meses = (diastotal % 365) / 30;
        dias = (diastotal % 365) % 30;

        //saída
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        }
}