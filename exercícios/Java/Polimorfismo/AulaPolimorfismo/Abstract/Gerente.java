package AulaPolimorfismo.Abstract;

public class Gerente extends Funcionario{
    public Gerente(String nome, Double bonificacao, Double salario) {
        super(nome, bonificacao, salario);
    }

    public Gerente(String nome) {
        super(nome, null,null);
    }

    public Gerente() {
        super(null, null, null);
    }


    @Override
    public Double getBonificacao() {
        return getSalario() * 2.00;
    }

}
