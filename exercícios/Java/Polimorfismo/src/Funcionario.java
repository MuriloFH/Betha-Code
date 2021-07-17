public class Funcionario extends Matricula{

    public Funcionario(){
        setTipoMatricula("Funcionario");
    }

    @Override
    public Double getSalario(){
        return super.getSalario() + (super.getSalario() * 0.10);
    }
}
