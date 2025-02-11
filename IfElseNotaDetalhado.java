package org.example;


import java.util.Scanner;
public class IfElseNotaDetalhado {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = read.nextLine();

        System.out.println("Digite a primeira nota: ");
        double notaUm = read.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double notaDois = read.nextDouble();

        double media = (notaUm + notaDois) / 2;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: ");

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5 && media < 6.9) {
            System.out.println("Verificação suplementar.");
        } else {
            System.out.println("Aluno reprovado!");
        }

    }
}
