package AulaPolimorfismo.Interface;

public class Carro implements VeiculoInterface, MotorInterface{

    @Override
    public String getNome() {
        return "Murilo";
    }

    @Override
    public String getID() {
        return "1000091462";
    }

    @Override
    public String getModelo() {
        return "Onix";
    }

    @Override
    public String getFabricante() {
        return "General Motors";
    }
}
