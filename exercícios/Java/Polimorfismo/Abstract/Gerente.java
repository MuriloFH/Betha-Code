package AulaPolimorfismo.Abstract;

public class Gerente extends Funcionario{
    public Gerente(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao() {
        return super.getBonificacao() * 1.15;
    }
}
