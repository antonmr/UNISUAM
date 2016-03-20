import java.util.Scanner;

class Aluno {
    int matricula;
    String nome;
}

class Teste {
    public static void main(String[] args) {
        Scanner s;
        Aluno pedro;

        s = new Scanner(System.in);
        pedro = new Aluno();
        System.out.print("Digite a matrícula: ");
        pedro.matricula = s.nextInt();
        System.out.print("Digite o nome: ");
        pedro.nome = s.next();
        System.out.println("Nome: " + pedro.nome);
        System.out.println("Matrícula: " + pedro.matricula);
    }
}
