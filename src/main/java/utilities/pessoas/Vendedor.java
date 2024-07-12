package utilities.pessoas;

public class Vendedor extends Pessoa{
    private String cpf;
    private float Salario;
    public Vendedor(String cpf, String nome , float Salario) {
        super(nome);
        this.cpf = cpf;
        this.Salario = Salario;
    }

    public String getcpf() {
        return cpf;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "cpf=" + cpf +
                "nome="+getNome()+
                ", Salario=" + Salario +
                '}';
    }
}
