package AulaPolimorfismo.Interface;

public class CarroMain {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(carro.getFabricante());
        System.out.println(carro.getID());
        System.out.println(carro.getModelo());
        System.out.println(carro.getNome());
    }
}
