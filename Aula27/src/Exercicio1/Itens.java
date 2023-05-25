package Exercicio1;

abstract class Itens {
    private String nome;
    private double preco;
    private String codigoBarras;


    public Itens(String codigoBarras,String nome, double preco) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    abstract void mostrarDetalhesDoItem();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }
    public static void procurar(Itens produto,Itens[] unidade){
        for (int i = 0; i<unidade.length;i++){
            if(produto.equals(unidade[i])){
                System.out.println("O produto está na posição " + i + ".");
                return;
            }
        }
        System.out.println("Produto não existente. ");
    }

}
