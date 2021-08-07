package AulaPolimorfismo.Abstract;

public class Diretor extends Gerente{
    public Diretor(String nome, Double bonificacao, Double salario) {
        super(nome, bonificacao, salario);
    }

    @Override
    public Double getBonificacao() {
        return getSalario() * 2.50;
    }
}
