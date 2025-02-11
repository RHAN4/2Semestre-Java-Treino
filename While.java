package org.example;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();

        while (idade < 18) {
            System.out.println("Acesso negado.");
            System.out.println("Informe sua idade: ");
            idade = ler.nextInt();
        }

        System.out.println("Acesso permitido.");
        System.out.println("Carregando...");
    }
}
