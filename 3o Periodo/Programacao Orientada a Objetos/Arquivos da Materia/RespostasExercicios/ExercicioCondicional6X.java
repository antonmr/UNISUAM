import java.util.Scanner;

class ExercicioCondicional6X {
    public static void main(String[] argumentos) {
        Scanner s;
        double num, res;

        s = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        num = s.nextDouble();
        if(num >= 0)
        {
            res = Math.sqrt(num);
            System.out.println("A raiz é " + res);
        }
        else
        {
            res = num * num;
            System.out.println("O quadrado é " + res);
        }
    }
}
