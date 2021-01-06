import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horainicio, horafinal, duracao;
        
        //entrada
                horainicio = teclado.nextInt();
                horafinal = teclado.nextInt();
                    
        //processamento
        if ( horainicio >= horafinal ) {
            duracao = horafinal + 24 - horainicio;
        }
        
        else {
            duracao = horafinal - horainicio;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }    
}