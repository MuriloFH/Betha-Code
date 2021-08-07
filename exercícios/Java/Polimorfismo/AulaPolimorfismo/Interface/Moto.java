package AulaPolimorfismo.Interface;

public class Moto implements VeiculoInterface, MotorInterface{

    @Override
    public String getNome() {
        return "Flavinho do pneu";
    }

    @Override
    public String getID() {
        return "1588092155";
    }

    @Override
    public String getModelo() {
        return "Pop 100";
    }

    @Override
    public String getFabricante() {
        return "Honda";
    }
}
