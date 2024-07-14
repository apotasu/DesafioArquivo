package src;

import src.dados.Estatisticas;
import src.ferramentas.arquivos.Exportar;
import src.ferramentas.arquivos.Importar;

public class Main {
    public static void main(String args[]){
        Importar importar = new Importar("teste");
        Exportar exportar = new Exportar("teste");
        importar.importarArquivo();
        exportar.exportarArquivo();
    }
}
