package src.vendas;

public class Item {
    private int id;
    private float preco;

    public Item(int id, float preco) {
        this.id = id;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", preco=" + preco +
                '}';
    }
}
