package Desafio_5;

public class Coordenador extends Funcionario{

    public Coordenador(int ID, String nome, String CPF, Double salarioBruto) {
        super(ID, nome, CPF, salarioBruto);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.20; //aplicando bonus
    }
}
