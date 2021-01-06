import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float num;
        int positivo = 0, negativo = 0, par = 0, impar = 0;
        
        for (int contador = 1; contador <= 5; contador++){
            num = teclado.nextFloat();
            
            if ( num != 0 && num > 0) {
                positivo++;
            }    
            
            if ( num != 0 && num < 0) {
                negativo++;
            }    
            
            if (num % 2 == 0) {
                par++;
            }    
            else {
                impar++;
            }
            
        }

        //saída
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}