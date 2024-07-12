package utilities.pessoas;

public class Cliente extends Pessoa{
    private String cnpj;
    private String bussinessArea;
    public Cliente(String cnpj,String nome, String bussinessArea) {
        super(nome);
        this.cnpj = cnpj;
        this.bussinessArea = bussinessArea;
    }

    public String getcnpj() {
        return cnpj;
    }
    

    public String getbussinessArea() {
        return bussinessArea;
    }

    public void setbussinessArea(String bussinessArea) {
        bussinessArea = bussinessArea;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cnpj=" + cnpj +
                "nome=" +getNome()+
                ", bussinessArea='" + bussinessArea + '\'' +
                '}';
    }
}
