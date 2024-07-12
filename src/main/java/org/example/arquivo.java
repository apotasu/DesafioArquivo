import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class arquivo {

    private int quantVendedor;
    private int quantCliente;
    private double maiorVenda;
    private int maiorId;
    private double menorVenda;
    private String piorVendedor;
    private String nome;

    public arquivo(String nome){
        this.nome = nome;
        importarArquivo(nome);
    }

    public void importarArquivo(String nome){
        File arquivo = new File(System.getProperty("user.home")+"//data//in//"+nome+".dat");
        try {
            Scanner scn = new Scanner(arquivo);
            while (scn.hasNextLine()) {
                String[] conteudo = scn.nextLine().split("\n");
                lerDados(conteudo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void lerDados(String [] conteudo){
        for (int i = 0; i<conteudo.length; i++){
            
            if (conteudo[i].contains("001")){
                lerDadosVendedor(conteudo[i]);
            }
             else if (conteudo[i].contains("002")){
                lerDadosCliente(conteudo[i]);
            }
             else {
                lerDadosVendas(conteudo[i]);
            }
        }
        exportarArquivo();
    }

    public void lerDadosVendedor(String conteudo){
        quantVendedor++;
    }

    public void lerDadosCliente(String conteudo){
        quantCliente++;
    }
    
    public void lerDadosVendas(String conteudo){
        String temp = conteudo.replaceAll("[\\[\\]]","");
        Scanner scan = new Scanner(temp);
        String[] dadosVenda = scan.next().split("[ç]");
        calcularVenda(dadosVenda[2], dadosVenda[1], dadosVenda[3]);
        
    }

    public void calcularVenda(String conteudo, String idCompra, String vendedor){
        String[] infoVenda = conteudo.split("[-,]");
        int id = Integer.parseInt(idCompra);

        for (int i = 0; i<infoVenda.length; i=i+3){
            int quant = Integer.parseInt(infoVenda[i+1]);
            double preco = Double.parseDouble(infoVenda[i+2]);
            if (quant*preco>=maiorVenda){
                maiorId = id;
                maiorVenda = quant*preco;

            } else if(quant*preco<=menorVenda || menorVenda==0){
                menorVenda = quant*preco;
                piorVendedor = vendedor;
            }
        }
    }

    public void exportarArquivo(){
            try {
                FileWriter arquivo = new FileWriter(new File(System.getProperty("user.home")+"//data//out//"+nome+".done.dat"));
                arquivo.write("Quantidade de clientes: "+ quantCliente +"\n");
                arquivo.write("Quantidade de vendedor: "+ quantVendedor +"\n");
                arquivo.write("ID da venda mais cara: "+ maiorId +"\n");
                arquivo.write("Pior vendedor: "+ piorVendedor+"\n");
                arquivo.close();
                
            } catch (IOException e) {
                System.out.println("Ocorreu um erro");
                e.printStackTrace();
            }
        }
    
}