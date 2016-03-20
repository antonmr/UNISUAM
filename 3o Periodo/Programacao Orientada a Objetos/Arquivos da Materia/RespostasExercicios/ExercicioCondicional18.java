import java.util.Scanner;

class ExercicioCondicional18 {
    public static void main(String[] argumentos) {
        Scanner s;
        int num;

        s = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        num = s.nextInt();
        if(num > 20 && num < 90)
            System.out.println(num + " está entre 20 e 90.");
        else
            System.out.println(num + " não está entre 20 e 90.");
    }
}
