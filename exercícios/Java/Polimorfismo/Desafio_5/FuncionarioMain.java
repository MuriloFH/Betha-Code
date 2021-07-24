package Desafio_5;

public class FuncionarioMain {
    public static void main(String[] args) {

        Funcionario funcionario = funcionarioBuilder.criaFuncionario("Analista",1,"Murilo",null,2700.00);
        Folha folhaJulho = new Folha(1, funcionario,"01/08/2021");

        folhaJulho.calcular();
        System.out.println("O salario liquido do " + funcionario.getNome() + " é: " + folhaJulho.getSalarioLiquido());

        Folha folhaAgosto = new Folha(2, funcionario,"01/09/2021");

        Descontos[] descontos = new Descontos[1];
        descontos[0] = new Descontos(1,"Unimed", 80.00);

        folhaAgosto.calcular(descontos);
        System.out.println("O salario liquido do " + funcionario.getNome() + " é: " + folhaAgosto.getSalarioLiquido());
    }
}
