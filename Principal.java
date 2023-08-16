package io.github.jiangdequan;

public class Principal {
    public static void main(String[] args) { 
        Editora bookman = new Editora();
        bookman.codigo = 7855;

        Livro java;
        java.codigo = 1234;
        java.nome = "Java: Como Programar";
        java.preco = 85.6;
        System.out.println(java.preco);
        
    }
}