package utilities.pessoas;

public class Cliente extends Pessoa{
    private int cpf;
    private String bussinessArea;
    public Cliente(String nome, int cpf, String bussinessArea) {
        super(nome);
        this.cpf = cpf;
        this.bussinessArea = bussinessArea;
    }

    public int getcpf() {
        return cpf;
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
                "cpf=" + cpf +
                ", bussinessArea='" + bussinessArea + '\'' +
                '}';
    }
}
