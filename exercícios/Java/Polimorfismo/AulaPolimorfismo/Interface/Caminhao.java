package AulaPolimorfismo.Interface;

public class Caminhao implements VeiculoInterface, MotorInterface{

    @Override
    public String getNome() {
        return "Daniel";
    }

    @Override
    public String getID() {
        return "18885512";
    }

    @Override
    public String getModelo() {
        return "FH16";
    }

    @Override
    public String getFabricante() {
        return "Volvo";
    }
}
