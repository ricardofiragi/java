import java.util.Scanner;

public class Uri1035a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;
        
        //entrada
        System.out.println("Digite o salario do funcionário: ");
        salario = teclado.nextInt();

        //processamento
        if ( salario <= 1000.00 ) {
            imposto = salario *0;
        }
        
        else if ( salario <= 1800.00 ) {
            imposto = salario * 0.1;
        } 
        
        else if ( salario <= 2500.00 ) {
            imposto = salario * 0.15;
        }

        else if ( salario <= 4000.00) {
            imposto = salario * 0.20;
        }
        
        else {
            imposto = 1300.00;
        }
        
        System.out.printf("Seu salario base: R$ %.2f\n", salario);
        System.out.printf("Imposto Retido  : R$ %.2f\n", imposto);
        System.out.printf("Salario Liquido : R$ %.2f\n", salario - imposto);
    }
}