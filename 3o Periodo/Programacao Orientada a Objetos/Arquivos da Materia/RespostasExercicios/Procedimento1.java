import java.util.Scanner;

class Procedimento1 {
    static void mostraMes(int num) {
        if(num == 1)
            System.out.println("Janeiro");
        else
            if(num == 2)
                System.out.println("Fevereiro");
            else
                if(num == 3)
                    System.out.println("Março");
                else
                    System.out.println("Erro");
    }

    public static void main(String[] args) {
        Scanner s;
        int valor;

        s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        valor = s.nextInt();
        mostraMes(valor);
    }
}
