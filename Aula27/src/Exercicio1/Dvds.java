package Exercicio1;

import java.sql.Time;

public class Dvds extends Itens{
    private int duracao;

    public Dvds(String codigoBarras, String nome, double preco, int duracao) {
        super(codigoBarras,nome, preco);
        this.duracao = duracao;

    }

    @Override
    void mostrarDetalhesDoItem() {
        System.out.println("\nCódigo de barras: "+getCodigoBarras());
        System.out.println("Nome: "+getNome() +", Preço: "+ getPreco() +", Duração: "+ duracao);

    }
}
