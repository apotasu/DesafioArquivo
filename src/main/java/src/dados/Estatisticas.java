package src.dados;

import src.ferramentas.arquivos.Importar;
import src.ferramentas.Calculadora;


public class Estatisticas {
    private String piorVendedor;
    private Importar importar;
    private int idVendaMaisCara;
    private float vendaMaisCara;
    private float piorVenda;
    private Calculadora calculadora;
    public Estatisticas(String nomeArquivo){
        importar = new Importar(nomeArquivo);
        importar.importarArquivo();
        calculadora = new Calculadora();
        vendaMaisCara = 0;
        piorVenda = -1;
    }
    public int getIdVendaMaisCara(){
        for (int i = 0; i< importar.getVendas().size(); i++){
            if (calculadora.calcularCustoCompra(importar.getVendas().get(i))>vendaMaisCara){
                vendaMaisCara = calculadora.calcularCustoCompra(importar.getVendas().get(i));
                idVendaMaisCara = importar.getVendas().get(i).getIdVenda();
            } else if (calculadora.calcularCustoCompra(importar.getVendas().get(i))<piorVenda||piorVenda == -1){
                piorVenda = calculadora.calcularCustoCompra(importar.getVendas().get(i));
            }
        }
        System.out.println("O id mais caro é " + idVendaMaisCara + " custando " + vendaMaisCara);
        return idVendaMaisCara;
    }
    public String getPiorVendedor(){
        for (int i = 0; i< importar.getVendas().size(); i++){
            if (calculadora.calcularCustoCompra(importar.getVendas().get(i))<=piorVenda){
                piorVenda = calculadora.calcularCustoCompra(importar.getVendas().get(i));
                piorVendedor = importar.getVendas().get(i).getVendedor();
            }
        }
        System.out.println("O pior vendedor é " + piorVendedor);
        return piorVendedor;
    }
    public int getQuantidadeCliente(){
        return importar.getClientes().size();
    }
    public int getQuantidadeVendedor(){
        return importar.getVendedores().size();
    }

}
