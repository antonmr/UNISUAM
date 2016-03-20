import java.util.Scanner;

class ExercicioRepeticao15 {
    public static void main(String[] args) {
        Scanner s;
        double num, res;
        int i;

        s = new Scanner(System.in);
        i = 1;
        while(i <= 8)
        {
            System.out.print("Digite um número: ");
            num = s.nextDouble();
            res = Math.log10(num);
            System.out.println(res);
            i = i + 1;
        }
    }
}
