import java.util.Scanner;

class ExercicioCondicional1 {
    public static void main(String[] arg) {
        Scanner s;
        int n;

        s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        n = s.nextInt();
        if(n % 2 == 0)
            System.out.println("O número " + n + " é par.");
        else
            System.out.println("O número " + n + " é ímpar.");
    }
}
