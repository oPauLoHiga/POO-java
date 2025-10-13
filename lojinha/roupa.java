package lojinha;

// Nome das roupas / preços / quantidade /
// modelo de impressão/ addQuantidade/
// removeQuantidade/ métodos de alterar nome e preço

public class roupa {
    public String nome;
    public double preco;
    public int quantidade;
    public int tamanho;
    public String modelo;
    public int addQuantidade;
    public int removeQuantidade;

    public double total() {
        return preco * quantidade;
    }

    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    // Objeto convertido para String
    public String toString() {
        return "Nome: "
                + nome
                + " / Preço: $"
                + String.format("%.2f", preco)
                + " / Quantidade: "
                + quantidade
                + " / Total: $"
                + String.format("%.2f", total());
    }
}
