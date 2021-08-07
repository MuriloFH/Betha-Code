package AulaPolimorfismo.Abstract;

public abstract class Secretaria extends Funcionario{
    public Secretaria(String nome, Double bonificacao, Double salario) {
        super(nome, bonificacao, salario);
    }

    public Secretaria(String nome) {
        super(nome, null,null);
    }
}
