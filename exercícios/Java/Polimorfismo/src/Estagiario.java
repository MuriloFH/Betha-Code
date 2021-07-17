public class Estagiario extends Matricula{

    public Estagiario(){
        setTipoMatricula("Estagiario");
    }

    @Override
    public Double getSalario(){
        return super.getSalario() + (super.getSalario() * 0.20);
    }
}
