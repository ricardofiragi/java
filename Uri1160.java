import java.util.Scanner;

public class Uri1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cont1, t, duracao = 1, Pa = 0, Pb = 0;
        double Ga = 0, Gb = 0;
        t = teclado.nextInt();
                   
        for (cont1 = 1; cont1 <= t; cont1++) {    
            Pa = teclado.nextInt();
            Pb = teclado.nextInt();
            Ga = teclado.nextDouble();
            Gb = teclado.nextDouble();
            duracao = 1;

            while (true) {
                Pa = (int)(Pa + (Pa * Ga / 100));
                Pb = (int)(Pb + (Pb * Gb / 100));
                duracao = duracao + 1;
                
                if (Pa >= Pb){
                    break;
                }
            }
            
            if (duracao <= 100){
                System.out.println(duracao +" anos.");
            }
            else {
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
}