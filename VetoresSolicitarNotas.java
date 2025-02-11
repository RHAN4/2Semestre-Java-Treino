package org.example;

import java.util.Scanner;
public class VetoresSolicitarNotas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        boolean validarNota;
        double[]notas = new double[2];

        for (int i = 0; i < 2; i++) {
            do{
                System.out.println("Digite a " + (i + 1) + "° nota: ");
                notas[i] = read.nextDouble();
                validarNota = notas[i] >= 0 && notas[i] <= 10;

            }while(!validarNota);
        }

        System.out.println("\n== EXIBINDO NOTAS ==");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        double media = (notas[0] + notas[1]) / 2;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Verificação suplementar.");
        } else {
            System.out.println("Reprovado.");
        }

        read.close();
    }
}