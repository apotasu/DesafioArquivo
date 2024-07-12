package Utilities.Ferramentas;

import Utilities.Vendas.Venda;

public class Calculadora {
    private Venda venda;

    public Calculadora(Venda venda){
        this.venda = venda;
    }

    public int calcularCustoCompra(){
        return venda.getPrecoItem()*venda.getQuantidadeItem();
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "venda=" + venda +
                '}';
    }
}
