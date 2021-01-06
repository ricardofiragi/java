import java.util.Scanner;

public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float x;
        
        //entrada
                x = teclado.nextFloat();
                    
        //processamento
        if ( x < 0.0 || x > 100.0 ) {
            System.out.println("Fora do intervalo");
        }
        
        else if ( x >= 0.0 && x <= 25.0 ) {
            System.out.println("Intervalo [0,25]");
        } 
                
        else if ( x > 25.0 && x <= 50.0 ) {
            System.out.println("Intervalo (25,50]");
        }
   
        else if ( x > 50.0 && x <= 75.0 ) {
            System.out.println("Intervalo (50,75]");
        }
        
        else if ( x > 75.0 && x <= 100.0 ) {
            System.out.println("Intervalo (75,100]");
        } 
    }
}