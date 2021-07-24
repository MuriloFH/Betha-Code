package Desafio_5;

public class Analista extends Funcionario{

    public Analista(int ID, String nome, String CPF, Double salarioBruto) {
        super(ID, nome, CPF, salarioBruto);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.10;//aplicando bonus
    }
}
