import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int NUMBER, HOUR;
        double HOURCOST, SALARY;

        //entrada
        NUMBER = teclado.nextInt();
        HOUR = teclado.nextInt();
        HOURCOST = teclado.nextFloat();
        
        //processamento
        SALARY = HOUR * HOURCOST;

        //saída
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);
    }
}