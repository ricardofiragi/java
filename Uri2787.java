import java.util.Scanner;

public class Uri2787{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linha, coluna;
        
        //entrada
        linha = teclado.nextInt();
        coluna = teclado.nextInt();
            
        //processamento
        if ( linha % 2 == coluna % 2 ) {
            System.out.println("1");
        }
        
        else {
            System.out.println("0");
        }         
    }
}