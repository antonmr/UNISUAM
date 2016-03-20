import java.util.Scanner;

class ExercicioVetor16 {
    public static void main(String[] args) {
        Scanner s;
        double[] altura;
        int i;
        double soma, media;

        s = new Scanner(System.in);
        altura = new double[10];
        soma = 0.0;
        for(i = 0; i < altura.length; i++)
        {
            System.out.print("Digite uma altura: ");
            altura[i] = s.nextDouble();
            soma = soma + altura[i];
        }
        media = soma / altura.length;
        System.out.println("Alturas maiores que a média:");
        for(i = 0; i < altura.length; i++)
            if(altura[i] > media)
                System.out.println(altura[i]);
    }
}