import java.util.Scanner;

class ExercicioCondicional6 {
    public static void main(String[] argumentos) {
        Scanner s;
        double num;

        s = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        num = s.nextDouble();
        if(num >= 0)
            System.out.println("A raiz é " + Math.sqrt(num));
        else
            System.out.println("O quadrado é " + num * num);
    }
}
