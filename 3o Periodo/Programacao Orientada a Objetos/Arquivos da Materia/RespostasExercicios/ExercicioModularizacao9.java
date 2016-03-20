import java.util.Scanner;

class ExercicioModularizacao9 {
    static int soma(int a, int b) {
        if(a == b)
            return a;
        else
            if(a < b)
                return a + soma(a + 1, b);
            else
                return soma(b, a);
    }

    public static void main(String[] args) {
        Scanner s;
        int valor1, valor2, resultado;

        s = new Scanner(System.in);
        System.out.print("Digite dois inteiros: ");
        valor1 = s.nextInt();
        valor2 = s.nextInt();
        resultado = soma(valor1, valor2);
        System.out.println("O resultado é " + resultado);
    }
}
