package AulaPolimorfismo.Abstract;

public class SecretariaAdministrativa extends Secretaria{
    public SecretariaAdministrativa(String nome, Double bonificacao, Double salario) {
        super(nome, bonificacao, salario);
    }

    public SecretariaAdministrativa(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario() * 1.35;
    }
}
