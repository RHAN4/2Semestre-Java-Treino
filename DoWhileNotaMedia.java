package org.example;

import java.util.Scanner;

public class DoWhileNotaMedia {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = read.nextLine();

        boolean notaValida;
        double notaUm;
        do {
            System.out.println("Digite a primeira nota: ");
            notaUm = read.nextDouble();
            notaValida = notaUm >= 0 && notaUm <= 10;

        } while (!notaValida);

        // Leitura e validação da segunda nota
        double notaDois;
        do {
            System.out.println("Digite a segunda nota: ");
            notaDois = read.nextDouble();
            notaValida = notaDois >= 0 && notaDois <= 10;

        } while (!notaValida);

        double media = (notaUm + notaDois) / 2;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: ");

        // Verificação da situação do aluno
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5 && media < 6.9) {
            System.out.println("Verificação suplementar.");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
