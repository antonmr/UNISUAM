import java.util.Scanner;

class ExercicioModularizacao10 {
    static int logDois(double x) {
        if(x <= 1.0)
            return 0;
        else
            if(x > 1.0 && x <= 2.0)
                return 1;
            else
                return 1 + logDois(x / 2);
    }

    public static void main(String[] args) {
        Scanner s;
        double valor;
        int resultado;

        s = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        valor = s.nextDouble();
        resultado = logDois(valor);
        System.out.println("O resultado é " + resultado);
    }
}
