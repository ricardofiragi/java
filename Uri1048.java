import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, reajuste, novosalario;
        
        //entrada
                salario = teclado.nextDouble();
                    
        //processamento
        if ( salario >= 0.0 && salario <= 400.0 ) {
            reajuste = salario * 0.15;
            novosalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novosalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        }
        
        else if ( salario > 400.0 && salario <= 800.0 ) {
            reajuste = salario * 0.12;
            novosalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novosalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
        } 
                
        else if ( salario > 800.0 && salario <= 1200.0 ) {
            reajuste = salario * 0.10;
            novosalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novosalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
        }
   
        else if ( salario > 1200.0 && salario <= 2000.0 ) {
            reajuste = salario * 0.07;
            novosalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novosalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
        }
        
        else if ( salario > 2000.0 ) {
            reajuste = salario * 0.04;
            novosalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novosalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
        } 
    }
}