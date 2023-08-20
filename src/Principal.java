public class Principal {
    public static void main(String[] args) { 
        Editora bookman = new Editora();
        //bookman.codigo = 7855;
        bookman.setCodigo(7855);
        bookman.setNome("Bookman");

        //java.codigo = 1234;
        //java.nome = "Java: Como Programar";
        //java.preco = 85.6;
        
        System.out.println(bookman.getCodigo());
        System.out.println(bookman.getNome());
    }
}
