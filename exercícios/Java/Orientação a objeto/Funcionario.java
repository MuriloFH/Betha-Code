import java.security.PublicKey;

public class Funcionario extends PessoaFisica{

    private Double salarioBruto, salarioLiquido;
    private Double dissidio = 0.0;

    public Funcionario(Integer id, String nome, String endereco, Integer telefone, Integer cpf, Integer rg, String sexo, Double salarioBruto, Double salarioLiquido) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public Double getDissidio(Double dissidio){
        return this.salarioBruto -= dissidio;
    }

}
