package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfElseNota {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Infome o seu nome: ");
        String nome = read.nextLine();

        System.out.println("Insira a primeira nota: ");
        double notaUm = read.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double notaDois = read.nextDouble();

        double media = (notaUm + notaDois) / 2;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: ");

        if (media > 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
