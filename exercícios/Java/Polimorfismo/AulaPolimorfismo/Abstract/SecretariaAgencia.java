package AulaPolimorfismo.Abstract;

public class SecretariaAgencia extends Secretaria{
    public SecretariaAgencia(String nome, Double bonificacao, Double salario) {
        super(nome, bonificacao, salario);
    }

    public SecretariaAgencia(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario() * 1.20;
    }
}
