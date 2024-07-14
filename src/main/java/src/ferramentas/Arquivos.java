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
                    newVenda(conteudo);
                    break;

        }
    }
    public void newVenda(ArrayList<String> conteudo){
        ArrayList<String> dadosVenda = new ArrayList<>(Arrays.asList(conteudo.get(2).split("[,-]")));
        int idVenda = Integer.parseInt(conteudo.get(1));
        for (int i = 0; i<dadosVenda.size(); i+=2){

        }
        Venda venda = new Venda(Integer.parseInt(conteudo.get(1)), Integer.parseInt(dadosVenda.get(0).substring(1,2)), Integer.parseInt(dadosVenda.get(1)), Float.parseFloat(dadosVenda.get(2)), conteudo.get(3));
        System.out.println(venda.toString());
    }
}
