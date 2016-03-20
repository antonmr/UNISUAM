import java.util.Scanner;

class ExercicioVetor26 {
    public static void main(String[] args) {
        Scanner s;
        float[] tabela;
        int[] quantidade;
        float precoLido, faturamento;
        int quantLida, numLido, i;

        s = new Scanner(System.in);
        tabela = new float[100];
        quantidade = new int[100];
        for(i = 0; i < tabela.length; i++)
        {
            System.out.print("Digite o preço, o número e a quantidade: ");
            precoLido = s.nextFloat();
            numLido = s.nextInt();
            quantLida = s.nextInt();
            tabela[numLido] = precoLido;
            quantidade[numLido] = quantLida;
        }
        faturamento = 0.0f;
        for(i = 0; i < tabela.length; i++)
            faturamento += tabela[i] * quantidade[i];
        System.out.println("O faturamento mensal: " + faturamento);
    }
}
