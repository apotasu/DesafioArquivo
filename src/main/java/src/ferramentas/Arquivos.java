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
    public void importarArquivo(String nome) {
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

    public void lerDados(ArrayList<String> conteudo) {
        switch (conteudo.get(0)) {
            case "001":
                Vendedor vendedor = new Vendedor(conteudo.get(1), conteudo.get(2), Float.parseFloat(conteudo.get(3)));
                System.out.println(vendedor.toString());
                break;
            case "002":
                Cliente cliente = new Cliente(conteudo.get(1), conteudo.get(2), conteudo.get(3));
                System.out.println(cliente.toString());
                break;
            case "003":
                novaVenda(conteudo.get(2).substring(1, conteudo.get(2).length()-1), Integer.parseInt(conteudo.get(1)), conteudo.get(3));
                break;

        }
    }

    public void novaVenda(String conteudo, int idVenda, String nomeVendedor) {
        ArrayList<String> dadosVenda = new ArrayList<>(Arrays.asList(conteudo.split("[-,]")));
        ArrayList<Venda> vendas = new ArrayList<>();
        Scanner scn = new Scanner(dadosVenda.get(0));
        for (int i = 0; i<dadosVenda.size(); i+=3){
            int idItem = Integer.parseInt(dadosVenda.get(i));
            int quantidadeItem = Integer.parseInt(dadosVenda.get(i+1));
            Float precoItem = Float.parseFloat(dadosVenda.get(i+2));
            System.out.println(new Venda(idVenda, idItem, quantidadeItem, precoItem, nomeVendedor));
        }
    }
}