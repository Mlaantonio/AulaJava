package Aula;
public class Editora {
    //Atributos
    private int codigo;
    private String nome;
    private String endereço;
    private String cidade;
//Métodos

    //Método construtora: Editora() *é incorporado pelo sistema
    //Usado para criar um novo objeto Junto com "new"
    //
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo>=0) {
    this.codigo = codigo;
        }
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
