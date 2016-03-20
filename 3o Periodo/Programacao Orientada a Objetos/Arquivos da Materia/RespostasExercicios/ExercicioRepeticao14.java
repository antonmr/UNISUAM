import java.util.Scanner;

class ExercicioRepeticao14 {
    public static void main(String[] args) {
        Scanner s;
        double num, raiz;
        int i;

        s = new Scanner(System.in);
        i = 1;
        while(i <= 15)
        {
            System.out.print("Digite um número: ");
            num = s.nextDouble();
            raiz = Math.sqrt(num);
            System.out.println(raiz);
            i = i + 1;
        }
    }
}