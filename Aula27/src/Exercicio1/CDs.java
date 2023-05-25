package Exercicio1;

public class CDs extends Itens {
    private int numeroFaixas;


    public CDs(String codigoBarras, String nome, double preco, int numeroFaixas) {
        super(codigoBarras,nome, preco);
        this.numeroFaixas = numeroFaixas;

    }

    @Override
    void mostrarDetalhesDoItem() {
        System.out.println("\nCódigo de barras: "+getCodigoBarras());
        System.out.println("Nome: "+getNome() +", Preço: "+ getPreco() +", Número de Faixas: "+ numeroFaixas);

    }
}
