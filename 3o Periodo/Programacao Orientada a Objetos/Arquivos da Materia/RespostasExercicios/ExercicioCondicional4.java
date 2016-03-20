import java.util.Scanner;

class ExercicioCondicional4 {
    public static void main(String[] argumentos) {
        Scanner s;
        int n;

        s = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        n = s.nextInt();
        if(n > 0)
            System.out.println(n + " é positivo");
        else
            if(n < 0)
            	System.out.println(n + " é negativo");
            else
            	System.out.println(n + " é nulo");
    }
}
