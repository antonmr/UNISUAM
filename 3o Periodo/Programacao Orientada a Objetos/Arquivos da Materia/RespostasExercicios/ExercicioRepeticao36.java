import java.util.Scanner;

class ExercicioRepeticao36 {
    public static void main(String[] args) {
        Scanner s;
        int n, i, fatorial;

        s = new Scanner(System.in);
	System.out.print("Digite um número inteiro: ");
	n = s.nextInt();
        fatorial = 1;
        i = 1;
        while(i <= n)
        {
            fatorial = fatorial * i;
            i = i + 1;
        }
	System.out.print("O fatorial de " + n + " é " + fatorial);
    }
}
