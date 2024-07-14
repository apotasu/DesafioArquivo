package src.ferramentas.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import src.dados.Estatisticas;

public class Exportar {
    private Estatisticas estatisticas;
    private String nomeArquivo;
    public Exportar(String nomeArquivo){
        estatisticas = new Estatisticas(nomeArquivo);
    }

    public void exportarArquivo(){
        try {
            FileWriter arquivo = new FileWriter(new File(System.getProperty("user.home")+"//data//out//"+nomeArquivo+".done.dat"));
            arquivo.write("Quantidade de clientes: "+ estatisticas.getQuantidadeCliente() +"\n");
            arquivo.write("Quantidade de vendedor: "+ estatisticas.getQuantidadeVendedor() +"\n");
            arquivo.write("ID da venda mais cara: "+ estatisticas.getIdVendaMaisCara() +"\n");
            arquivo.write("Pior vendedor: "+ estatisticas.getPiorVendedor() +"\n");
            arquivo.close();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }

}
