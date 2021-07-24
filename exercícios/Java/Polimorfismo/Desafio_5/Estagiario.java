package Desafio_5;

public class Estagiario extends Funcionario{

    public Estagiario(int ID, String nome, String CPF, Double salarioBruto) {
        super(ID, nome, CPF, salarioBruto);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.05;//aplicando bonus
    }


}

