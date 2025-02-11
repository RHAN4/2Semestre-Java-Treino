package org.example;

import java.util.Scanner;

public class LojaMamao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor do produto comprado: ");
        double valor = teclado.nextDouble();

        double prestacao = valor / 5;

        System.out.println("Valor das prestações: " + prestacao);
    }
}