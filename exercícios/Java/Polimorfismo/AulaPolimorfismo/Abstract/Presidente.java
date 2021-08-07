package AulaPolimorfismo.Abstract;

public class Presidente extends Funcionario{
    public Presidente(String nome, Double bonificacao, Double salario) {
        super(nome, bonificacao, salario);
    }

    @Override
    public Double getBonificacao() {
        return getSalario() * 3.00;
    }
}
