import java.util.Scanner;

class ExercicioCondicional1 {
    public static void main(String[] arg) {
        Scanner s;
        int num;

        s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        num = s.nextInt();
        if(num > 20)
            System.out.println(num);
    }
}
