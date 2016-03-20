import java.util.Scanner;

class ExercicioModularizacao1 {
    static void semana(int dia) {
        if(dia == 2 || dia == 4 || dia == 6)
            System.out.println("trabalho");
        else
            if(dia == 1 || dia == 7)
                System.out.println("fim de semana");
            else
                System.out.println("sem trabalho");
    }

    public static void main(String[] args) {
        Scanner s;
        int valor;

        s = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        valor = s.nextInt();
        semana(valor);
    }
}
