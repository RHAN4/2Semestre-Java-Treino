package org.example;

public class ComparacaoTipos {
    public static void main(String[] args) {
        String nomeUsuario = "Marta";
        int senha = 1234;

        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 5678);

        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha do usuário está correto? " + resultadoSenha);
    }
}
