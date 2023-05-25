package Exercicio1;

public class Livros extends Itens {
    private String nome, autor;

    public Livros(String codigoBarras, String nome, double preco, String autor) {
        super(codigoBarras,nome, preco);
        this.autor = autor;

    }
    @Override
    void mostrarDetalhesDoItem() {
        System.out.println("\nCódigo de barras: "+getCodigoBarras());
        System.out.println("Nome: "+getNome() +", Preço: "+ getPreco() +", Autor: "+ autor);
    }
}
