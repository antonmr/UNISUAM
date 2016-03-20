import java.util.Scanner;

class ExercicioCondicional12 {
    public static void main(String[] argumentos) {
        Scanner s;
        double salarioBruto, valorDaPrestacao;

        s = new Scanner(System.in);
        System.out.print("Digite o salário bruto: ");
        salarioBruto = s.nextDouble();
        System.out.print("Digite o valor da prestação: ");
        valorDaPrestacao = s.nextDouble();
        if(valorDaPrestacao > 0.3 * salarioBruto)
            System.out.println("O empréstimo não pode ser concedido.");
        else
            System.out.println("O empréstimo pode ser concedido.");
    }
}
