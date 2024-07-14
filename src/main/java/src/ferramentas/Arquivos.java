package src.ferramentas;

import src.pessoas.Cliente;
import src.pessoas.Vendedor;
import src.vendas.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arquivos {
    public void importarArquivo(String nome){
        File arquivo = new File("/home/cathy/data/in/faggot.dat");
        try {
            Scanner scn = new Scanner(arquivo);
            while (scn.hasNextLine()) {
                ArrayList<String> conteudo = new ArrayList<>(Arrays.asList(scn.nextLine().split("ç")));
                lerDados(conteudo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void lerDados(ArrayList<String> conteudo){
            switch (conteudo.get(0)){
                case "001":
                    Vendedor vendedor = new Vendedor(conteudo.get(1), conteudo.get(2), Float.parseFloat(conteudo.get(3)));
                    System.out.println(vendedor.toString());
                    break;
                case "002":
                    Cliente cliente = new Cliente(conteudo.get(1),conteudo.get(2),conteudo.get(3));
                    System.out.println(cliente.toString());
                    break;
                case "003":
                    ArrayList<String> dadosVenda = new ArrayList<>(Arrays.asList(conteudo.get(2).split("[,-]")));
                    Venda venda = new Venda(Integer.parseInt(conteudo.get(0)),Integer.parseInt(dadosVenda.get(1)),Integer.parseInt(dadosVenda.get(2)),Float.parseFloat(dadosVenda.get(3)),dadosVenda.get(4));
                    System.out.println(venda.toString());
                    break;

        }
    }
    public void newVenda(String conteudo){
        ArrayList<String> dadosVenda = new ArrayList<>(Arrays.asList(conteudo.split("[,-]")));
        System.out.println(conteudo);
    }
}
