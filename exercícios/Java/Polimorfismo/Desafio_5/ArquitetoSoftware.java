package Desafio_5;

public class ArquitetoSoftware extends Funcionario{

    public ArquitetoSoftware(int ID, String nome, String CPF, Double salarioBruto) {
        super(ID, nome, CPF, salarioBruto);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.15;//aplicando bonus
    }
}
