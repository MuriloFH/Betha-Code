package AulaPolimorfismo.Abstract;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("murilo");
        funcionario.setSalario(7000.00);
        System.out.println(funcionario.getBonificacao());
    }
}
