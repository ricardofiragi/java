import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x = 0, alcool = 0, gasolina = 0, diesel = 0;
                                        
        while (x != 4) {
            x = teclado.nextInt();
            
            if (x > 4 || x <= 0) {
            }
            
            else if (x == 4) {
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
            }
                
            else if (x == 1) {
                alcool++;
            }
                
            else if (x == 2) {
                gasolina++;
            }
                
            else if (x == 3) {
                diesel++;
            }
        }
    }
}