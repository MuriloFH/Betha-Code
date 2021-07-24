package Desafio_5;

public class funcionarioBuilder {

    public static Funcionario criaFuncionario(String tipo, int ID, String nome, String CPF, Double salarioBruto) {

        if (tipo.equals("Estagiário")) {
            return new Estagiario(ID, nome, null, salarioBruto);
        } else if (tipo.equals("Analista")) {
            return new Analista(ID, nome, null, salarioBruto);
        } else if (tipo.equals("Arquiteto")) {
            return new ArquitetoSoftware(ID, nome, null, salarioBruto);
        }else if (tipo.equals("Coordenador")){
            return new Coordenador(ID,nome,null,salarioBruto);
        }else return new Funcionario(ID, nome);

    }

}

