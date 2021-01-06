public class Continhas{
    public static void main(String args[]){
        //quero declara variáeis, ou seja, reservar espaços na memória
        int a;
        int b;
        int c;
        // tb poderia ser int a, b, c;
        a = 19;
        b = 3;

        c = a + b;

        System.out.println(" ");
        System.out.println("Valor do a = "+ a);
        System.out.println("Valor do b = "+ b);
        System.out.println("Valor da soma = "+ c);

        c = a - b;
        System.out.println(" ");
        System.out.println("Valor da subtração = "+ c);

        c = a * b;
        System.out.println(" ");
        System.out.println("Valor da Multiplicação = "+ c);

        c = a / b;
        System.out.println(" ");
        System.out.println("Valor da Divisão = "+ c);

        c = a % b;
        System.out.println(" ");
        System.out.println("Valor do Resto Divisão = "+ c);

        double x;

        x = 1.0/2;
        System.out.println(" ");
        System.out.println("Valor do x = "+ x);

        float y;

        y = 1.0f/2;
        System.out.println(" ");
        System.out.println("Valor do y = "+ y);

    }
}