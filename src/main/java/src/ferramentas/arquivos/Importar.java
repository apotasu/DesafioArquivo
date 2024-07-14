package src.ferramentas.arquivos;

import src.ferramentas.Tipos;
import src.pessoas.Cliente;
import src.pessoas.Vendedor;
import src.vendas.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Importar {
    private Venda venda;
    private ArrayList<Venda> vendas = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    String nomeArquivo;

    public Importar(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void importarArquivo() {
        File arquivo = new File(System.getProperty("user.home")+"/data/in/"+nomeArquivo+".dat");
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
        String idTipo = conteudo.get(0);
        Tipos tipo = Tipos.fromId(idTipo);

        switch (tipo) {
            case VENDEDOR:
                Vendedor vendedor = new Vendedor(conteudo.get(1), conteudo.get(2), Float.parseFloat(conteudo.get(3)));
                vendedores.add(vendedor);
                System.out.println(vendedor.toString());
                break;
            case CLIENTE:
                Cliente cliente = new Cliente(conteudo.get(1), conteudo.get(2), conteudo.get(3));
                clientes.add(cliente);
                System.out.println(cliente.toString());
                break;
            case VENDA:
                novaVenda(conteudo.get(2).substring(1, conteudo.get(2).length() - 1), Integer.parseInt(conteudo.get(1)), conteudo.get(3));
                break;
            case NONE:
                // Tratar caso para NONE se necessário
                System.err.println("Tipo desconhecido: " + idTipo);
                break;
        }
    }

    public void novaVenda(String conteudo, int idVenda, String nomeVendedor) {
        ArrayList<String> dadosVenda = new ArrayList<>(Arrays.asList(conteudo.split("[-,]")));
        for (int i = 0; i < dadosVenda.size(); i += 3) {
            int idItem = Integer.parseInt(dadosVenda.get(i));
            int quantidadeItem = Integer.parseInt(dadosVenda.get(i + 1));
            Float precoItem = Float.parseFloat(dadosVenda.get(i + 2));
            venda = new Venda(idVenda, idItem, quantidadeItem, precoItem, nomeVendedor);
            vendas.add(venda);
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
}
