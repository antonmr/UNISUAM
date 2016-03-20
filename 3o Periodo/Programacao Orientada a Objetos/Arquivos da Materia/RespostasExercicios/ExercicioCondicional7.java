import java.util.Scanner;

class ExercicioCondicional7 {
    public static void main(String[] argumentos) {
        Scanner s;
        int num;

        s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        num = s.nextInt();
        if(num % 3 == 0)
            System.out.println(num + " é múltiplo de 3");
        else
            System.out.println(num + " não é múltiplo de 3");
    }
}
