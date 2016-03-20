import java.util.Scanner;

class ExercicioCondicional24 {
    public static void main(String[] argumentos) {
        Scanner s;
        int idade;

        s = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        idade = s.nextInt();
        if(idade < 16)
            System.out.println("não eleitor");
        else
            if(idade >= 18 && idade < 65)
            	System.out.println("eleitor obrigatório");
            else
            	System.out.println("eleitor facultativo");
    }
}
