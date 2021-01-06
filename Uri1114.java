import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo = 0;
                   
        while (codigo != 2002) {    
            codigo = teclado.nextInt();

            if (codigo != 2002) {
                System.out.println("Senha Invalida");
            }
            
            else {
                System.out.println("Acesso Permitido");
            }
        }
    }
}