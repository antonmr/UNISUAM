import java.util.Scanner;

class ExercicioCondicional9 {
    public static void main(String[] argumentos) {
        Scanner s;
        int a, b;

        s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        a = s.nextInt();
        System.out.print("Digite um número inteiro: ");
        b = s.nextInt();
        if(a % b == 0)
            System.out.println(a + " é divisível por " + b);
        else
            System.out.println(a + " não é divisível por " + b);
    }
}
