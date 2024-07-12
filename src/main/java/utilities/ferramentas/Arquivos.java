package utilities.ferramentas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivos {
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
  /*  public void lerDados(String [] conteudo){
        for (int i = 0; i<conteudo.length; i++){

            if (conteudo[i].contains("001")){
                Cliente cliente = new
            }
            else if (conteudo[i].contains("002")){
                lerDadosCliente(conteudo[i]);
            }
            else {
                lerDadosVendas(conteudo[i]);
            }
        }
        exportarArquivo();
    }*/
}
