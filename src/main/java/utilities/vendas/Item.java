package utilities.vendas;

public class Item {
    private int id;
    private int preco;

    public Item(int id, int preco) {
        this.id = id;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
