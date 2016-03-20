import java.util.Scanner;

class ExercicioRepeticao30 {
    public static void main(String[] args) {
        Scanner s;
        double num, somaPositivos;
        int i, contaNegativos;

        s = new Scanner(System.in);
	somaPositivos = 0.0;
	contaNegativos = 0;
        i = 1;
        while(i <= 20)
        {
            System.out.print("Digite um número: ");
            num = s.nextDouble();
            if(num > 0)
		somaPositivos = somaPositivos + num;
	    else
		if(num < 0)
			contaNegativos = contaNegativos + 1;
            i = i + 1;
        }
	System.out.println("A soma de positivos é " + somaPositivos);
	System.out.println("O total de negativos é " + contaNegativos);
    }
}
