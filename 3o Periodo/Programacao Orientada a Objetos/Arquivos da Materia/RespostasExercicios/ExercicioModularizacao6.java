import java.util.Scanner;

class ExercicioModularizacao6 {
    static int fatorial(int n) {
        if(n <= 0)
            return 1;
        else
            return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner s;
        int valor, resultado;

        s = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        valor = s.nextInt();
        resultado = fatorial(valor);
        System.out.println("O resultado é " + resultado);
    }
}
