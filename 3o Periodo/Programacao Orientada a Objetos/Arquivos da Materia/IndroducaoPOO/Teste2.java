import java.util.Scanner;

class Aluno {
    int matricula;
    String nome;

    void mostrar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
    }

    void ler() {
        Scanner s;

        s = new Scanner(System.in);
        System.out.print("Digite a matrícula: ");
        this.matricula = s.nextInt();
        System.out.print("Digite o nome: ");
        this.nome = s.next();
    }
}

class Teste2 {
    public static void main(String[] args) {
        Aluno aluno1, aluno2;
        
        aluno1 = new Aluno();
        aluno1.ler();
        aluno1.mostrar();
        aluno2 = new Aluno();
        aluno2.ler();
        aluno2.mostrar();
    }
}