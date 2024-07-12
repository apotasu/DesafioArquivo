package utilities.pessoas;

public class Vendedor extends Pessoa{
    private int cnpj;
    private int Salario;
    public Vendedor(String nome, int cnpj, int Salario) {
        super(nome);
        this.cnpj = cnpj;
        this.Salario = Salario;
    }

    public int getcnpj() {
        return cnpj;
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
                "cnpj=" + cnpj +
                ", Salario=" + Salario +
                '}';
    }
}
