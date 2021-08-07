package AulaPolimorfismo.Matricula;

public class Matricula{

    private String nome;
    private Double salario;
    private String tipoMatricula;

    public Matricula(String nome, Double salario, String tipoMatricula) {
        this.nome = nome;
        this.salario = salario;
        this.tipoMatricula = tipoMatricula;
    }

    public Matricula(){
        setTipoMatricula("Normal");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTipoMatricula() {
        return tipoMatricula;
    }

    public void setTipoMatricula(String tipoMatricula) {
        this.tipoMatricula = tipoMatricula;
    }
}
