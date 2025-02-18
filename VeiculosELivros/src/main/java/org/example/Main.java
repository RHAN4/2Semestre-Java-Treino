package org.example;

public class Main {
    public static void main(String[] args) {
        Livros livro1 = new Livros("Gash Bell", "Makoto Raiku", 1234, 158, 50.85f);
        Livros livro2 = new Livros("Hellsing", "Kouta Hirano", 5678, 341, 89.15f);

        System.out.println("1º Livro:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Nome do autor: " + livro1.getAutor());
        System.out.println("ISBN: " + livro1.getISBN());
        System.out.println("Número de páginas: " + livro1.getNumeroPaginas());
        System.out.println("Preço: " + livro1.getPreco());

        System.out.println("\n");

        System.out.println("2º Livro:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Nome do autor: " + livro2.getAutor());
        System.out.println("ISBN: " + livro2.getISBN());
        System.out.println("Número de páginas: " + livro2.getNumeroPaginas());
        System.out.println("Preço: " + livro2.getPreco());

        Veiculos veiculo1 = new Veiculos("Vortex Motors", "Thunder X1", "RXT-8492", 2023);
        Veiculos veiculo2 = new Veiculos("Titan Automóveis", "Stratos V8", "GKP-3721", 2021);

        System.out.println("\n");

        System.out.println("1º Veiculo: ");
        System.out.println("Marca: " + veiculo1.getMarca());
        System.out.println("Modelo: " + veiculo1.getModelo());
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Ano: " + veiculo1.getAno());

        System.out.println("\n");

        System.out.println("2º Veiculo: ");
        System.out.println("Marca: " + veiculo2.getMarca());
        System.out.println("Modelo: " + veiculo2.getModelo());
        System.out.println("Placa: " + veiculo2.getPlaca());
        System.out.println("Ano: " + veiculo2.getAno());

    }
}