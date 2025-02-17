package org.example;

import java.util.Objects;
import java.util.Scanner;

public class LoginEsenha {
    public static void main(String[] args) {
        String login = "joao123";
        int senha = 456789;

        Scanner insercao = new Scanner(System.in);
        System.out.println("Digite o nome do usuário: ");
        login = insercao.nextLine();
        System.out.println("Digite a senha: ");
        senha = insercao.nextInt();

//        boolean usuarioCorreto = login.equals("joao123");
//        boolean senhaCorreta = (senha == 456789);

        if (Objects.equals(login, "joao123") && Objects.equals(senha, 456789)) {
            System.out.println("Bem-vindo, usuário logado!");
        } else {
            System.out.println("Usuário ou senha inválido.");
        }
    }
}