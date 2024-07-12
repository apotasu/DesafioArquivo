package Utilities.Pessoas;

public class Vendedor extends Pessoa{
    private int CNPJ;
    private int Salario;
    public Vendedor(String nome, int CNPJ, int Salario) {
        super(nome);
        this.CNPJ = CNPJ;
        this.Salario = Salario;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "CNPJ=" + CNPJ +
                ", Salario=" + Salario +
                '}';
    }
}
