/*
Escreva um programa em Java que armazene em um vetor
 quinze números aleatórios (cada um deles é um valor
 de 0.0 até 1.0). Após isso, o programa deve imprimir
 todos os valores armazenados. */

class ExercicioVetorAleatorio1 {
    public static void main(String[] args) {
        double[] vet;
        int i;

        vet = new double[15];
        for(i = 0; i < vet.length; i++)
            vet[i] = Math.random();
        for(i = 0; i < vet.length; i++)
            System.out.println("vet[" + i + "] = " + vet[i]);
    }
}