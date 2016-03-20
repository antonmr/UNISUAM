import java.util.Scanner;

class ExercicioCondicional8 {
    public static void main(String[] argumentos) {
        Scanner s;
        int num;

        s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        num = s.nextInt();
        if(num % 5 != 0)
            System.out.println(num + " não é divisível por 5");
        else
            System.out.println(num + " é divisível por 5");
    }
}
