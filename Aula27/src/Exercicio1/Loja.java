package Exercicio1;

public class Loja {
    public static void main(String[] args) {
        Itens produtos[] = new Itens[5];

        produtos[0] = new Livros("123","Harry Potter e a Pedra Filosofal", 35, "J. K. Rowling");
        produtos[1] = new CDs("234","Depois do Fim", 39.90, 13);
        produtos[2] = new Dvds("345","This is Us", 30.00, 92);
        produtos[3] = new Livros("456","Mau Começo", 18.99, "Daniel Handler");
        produtos[4] = new CDs("567","Purpose", 35.00, 19);

        for (Itens produto : produtos) {
            produto.mostrarDetalhesDoItem();
        }
        Itens itemBuscado = produtos[0];
        Itens.procurar(itemBuscado, produtos);

        Itens produtoIgual = new Livros("123","Harry Potter e a Pedra Filosofal", 35, "J. K. Rowling");
        Itens produtoDiferente = new Livros("0987","Harry Potter e a Pedra Filosofal", 35, "J. K. Rowling");

        System.out.println(itemBuscado.equals(produtoIgual));
        System.out.println(itemBuscado.equals(produtoDiferente));

    }
}
