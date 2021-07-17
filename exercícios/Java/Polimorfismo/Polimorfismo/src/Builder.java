import java.util.Scanner;

public class Builder {

    public static Matricula criaMatricula(String tipoMatricula){
        if (tipoMatricula.equals("Funcionario")){
            return new Funcionario();
        } else if (tipoMatricula.equals("Estagiario")){
            return new Estagiario();
        }else{
            return new Matricula();
        }
    }

    public static void main(String[] args) {
        Scanner readln = new Scanner(System.in);
        String tipo;
        System.out.println("Digite o tipo da matricula: ");
        tipo = readln.nextLine();

        Matricula matricula = Builder.criaMatricula(tipo);

        if (tipo.equals("Funcionario")) {
            matricula.setSalario(500.00);
            System.out.println(matricula.getSalario());
        }else if (tipo.equals("Estagiario")){
            matricula.setSalario(300.00);
            System.out.println(matricula.getSalario());
        }
    }
}
