package Utilities.Pessoas;

public class Cliente extends Pessoa{
    private int CPF;
    private String BussinessArea;
    public Cliente(String nome, int CPF, String BussinessArea) {
        super(nome);
        this.CPF = CPF;
        this.BussinessArea = BussinessArea;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getBussinessArea() {
        return BussinessArea;
    }

    public void setBussinessArea(String bussinessArea) {
        BussinessArea = bussinessArea;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "CPF=" + CPF +
                ", BussinessArea='" + BussinessArea + '\'' +
                '}';
    }
}
