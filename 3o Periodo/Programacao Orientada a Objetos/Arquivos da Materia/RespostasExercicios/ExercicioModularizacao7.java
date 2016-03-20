import java.util.Scanner;

class ExercicioModularizacao7 {
    static int fatorial(int n) {
        int fat, i;

        fat = 1;
        i = 1;
        while(i <= n)
        {
            fat = fat * i;
            i = i + 1;
        }
        return fat;
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
