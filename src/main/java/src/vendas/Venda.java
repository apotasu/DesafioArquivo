package src.vendas;

import src.pessoas.Vendedor;

public class Venda {
    private int quantidadeItem;
    private Item item;
    private String vendedor;
    private int idVenda;
    public Venda(int idVenda, int itemId, int quantidadeItem, float precoItem, String vendedor) {
        item = new Item(itemId, precoItem);
        this.idVenda = idVenda;
        this.quantidadeItem = quantidadeItem;
        this.vendedor = vendedor;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public float getPrecoItem() {
        return item.getPreco();
    }

    @Override
    public String toString() {
        return "Venda{" +
                "quantidadeItem=" + quantidadeItem +
                ", " + item.toString() +
                ", vendedor=" + vendedor +
                ", idVenda=" + idVenda +
                '}';
    }
}
