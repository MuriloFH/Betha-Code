import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Desafio_04 {
    public static void main(String[] args) {

        Cliente Cliente = new Cliente(1, "Murilo", "Av lalala", 40028922, 071553154, 55488, "Maculino", 500.0, 0.0);
        Funcionario Funcionario = new Funcionario(1, "Lucas", "Av lalala", 40028922, 0775314, 4558, "Masculino", 4800.00, 4200.00);

        Scanner readln = new Scanner(System.in);

        Double aumentandoLimite = 0.0;
        Double diminuindoLimite = 0.0;
        Boolean teste = false;


        while (teste == false) {
            System.out.print("Você quer 1-aumentar ou 2-diminuir o limite do crédito?: ");
            int resposta = Integer.parseInt(readln.nextLine());

            if (resposta == 1) {

                teste = true;

                System.out.print("Digite o valor para aumentar o limite de crédito: ");
                aumentandoLimite = Double.parseDouble(readln.nextLine()); //transformando string do Scanner em Double
                //System.out.println(aumentandoLimite); //Testando o aumentandoLimite

                Cliente.getAumentaLimite(aumentandoLimite); //utilizando o metodo da classe Cliente

                System.out.println("Crédito atual: " + Cliente.getLimiteCrediario());//resultado para o usuario

            } else if (resposta == 2) {

                teste = true;
                System.out.print("Digite o valor para diminuir o limite de crédito: ");
                diminuindoLimite = Double.parseDouble(readln.nextLine());
                //System.out.println(dimuindoLimite); //Testando o diminuindoLimite

                Cliente.getDiminuiLimite(diminuindoLimite);

                System.out.println("Crédito atual: " + Cliente.getLimiteCrediario());

            } else {
                System.out.println("Digite um valor válido!");
            }
        }

        //Aplicando o desconto do dissídio
        Double descontoDissidio = 0.0;
        System.out.println("Salario bruto do funcionário: " + Funcionario.getSalarioBruto());

        System.out.println("Digite o valor do dissídio: ");
        descontoDissidio = Double.parseDouble(readln.nextLine());

        Funcionario.getDissidio(descontoDissidio);//metodo para desconto

        System.out.println("Salário bruto com desconto do dissídio: " + Funcionario.getSalarioBruto());


    }
}