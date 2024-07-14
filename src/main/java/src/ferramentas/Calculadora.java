package src.ferramentas;

import src.vendas.Venda;

public class Calculadora {

    public Calculadora(){

    }

    public float calcularCustoCompra(Venda venda){
        return venda.getPrecoItem()*venda.getQuantidadeItem();
    }

}
