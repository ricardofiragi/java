import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horainicio, minutoinicio, inicio, horafinal, minutofinal, ofinal, duracao, duracaohoras, duracaominutos;
        
        //entrada
                horainicio = teclado.nextInt();
                minutoinicio = teclado.nextInt();
                horafinal = teclado.nextInt();
                minutofinal = teclado.nextInt();
                    
        //processamento
        inicio = horainicio * 60 + minutoinicio;
        ofinal = horafinal * 60 + minutofinal;

        if ( inicio >= ofinal ) {
            duracao = ofinal + 1440 - inicio;
        }
        
        else {
            duracao = ofinal - inicio;
        }

        duracaohoras = duracao / 60;
        duracaominutos = duracao % 60;

        System.out.println("O JOGO DUROU " + duracaohoras + " HORA(S) E " + duracaominutos + " MINUTO(S)");
    }    
}