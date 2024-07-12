package utilities.vendas;

import utilities.pessoas.Vendedor;

public class Venda {
    private int quantidadeItem;
    private Item item;
    private Vendedor vendedor;
    private int idVenda;
    public Venda(int idVenda, int quantidadeItem, int itemId, int precoItem) {
        item = new Item(itemId, precoItem);
        this.idVenda = idVenda;
        this.quantidadeItem = quantidadeItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public int getPrecoItem() {
        return item.getPreco();
    }
}
