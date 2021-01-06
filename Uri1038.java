import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo, qtde;
        double conta;
        conta = 0;

        //entrada
        codigo = teclado.nextInt();
        qtde = teclado.nextInt();
    
        //processamento
        if ( codigo == 1 ) {
            conta = qtde * 4.00;
        }
        
        else if ( codigo == 2 ) {
            conta = qtde * 4.50;
        } 
        
        else if ( codigo == 3 ) {
            conta = qtde * 5.00;
        }

        else if ( codigo == 4 ) {
            conta = qtde * 2.00;
        }
        
        else if ( codigo == 5 ) {
            conta = qtde * 1.50;
        }
        
        System.out.printf("Total: R$ %.2f\n", conta);
    }
}