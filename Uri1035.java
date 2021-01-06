import java.util.Scanner;

public class Uri1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float a, b, c, d;
        
        //entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        //processamento
        if (b > c){
            if (d > a){
                if ((c + d) > (b + a)){
                    if (c >= 0){
                        if (d >= 0){
                            if (a % 2 < 1)
                            System.out.println("Valores aceitos");
                        }
                        else{
                            System.out.println("Valores nao aceitos");
                        }
                    }
                    else{
                    System.out.println("Valores nao aceitos");
                    }
                }
                else{
                System.out.println("Valores nao aceitos");
                }
            }
            else{
            System.out.println("Valores nao aceitos");
            }
        }
        else{
        System.out.println("Valores nao aceitos");
        }      
    }
}