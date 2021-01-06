import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;
        
        //entrada
                salario = teclado.nextDouble();
                    
        //processamento
        if ( salario >= 0.0 && salario <= 2000.0 ) {
            System.out.println("Isento");
        }
        
        else if ( salario > 2000.0 && salario <= 3000.0 ) {
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } 
                
        else if ( salario > 3000.0 && salario <= 4500.0 ) {
            imposto = (salario - 3000) * 0.18 + 80;
            System.out.printf("R$ %.2f\n", imposto);
        }
   
        else {
            imposto = (salario - 4500) * 0.28 + 80 + 270;
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}