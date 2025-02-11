package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do {
            System.out.println("Digite uma nota: ");
            notas.add(ler.nextDouble());

            System.out.println("Deseja inserir mais uma nota? Pressione a tecla N para sair.");
            //System.out.println("\nPressione a tecla N para sair.");
            resposta = ler.next();
        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas: ");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }
    }
}
