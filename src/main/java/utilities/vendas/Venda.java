package utilities.vendas;

public class Venda {
    private Item item;
    public Venda(int itemID, int quantidadeItem, int precoItem) {
        ItemID = itemID;
        this.quantidadeItem = quantidadeItem;
        this.precoItem = precoItem;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int itemID) {
        ItemID = itemID;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public int getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(int precoItem) {
        this.precoItem = precoItem;
    }
}
