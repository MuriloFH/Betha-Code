package AulaPolimorfismo.Abstract;

public abstract class Funcionario {

    private String nome;
    private Double bonificacao;
    private Double salario;

    public Funcionario(String nome, Double bonificacao, Double salario) {
        this.nome = nome;
        this.bonificacao = bonificacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Double getBonificacao();

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
