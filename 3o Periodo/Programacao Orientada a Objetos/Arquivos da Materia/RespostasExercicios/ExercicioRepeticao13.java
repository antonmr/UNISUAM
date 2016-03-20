import java.util.Scanner;

class ExercicioRepeticao13 {
    public static void main(String[] args) {
        Scanner s;
        double num, cubo;
        int i;

        s = new Scanner(System.in);
        i = 1;
        while(i <= 10)
        {
            System.out.print("Digite um número: ");
            num = s.nextDouble();
            cubo = num * num * num;
            System.out.println(cubo);
            i = i + 1;
        }
    }
}