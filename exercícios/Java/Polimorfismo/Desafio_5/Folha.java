package Desafio_5;

public class Folha {

    private int ID;
    private Funcionario funcionario;
    private String dataPagamento;
    private Descontos[] listaDesconto;
    private Double salarioLiquido;

    public Folha(int ID, Funcionario funcionario, String dataPagamento) {
        this.ID = ID;
        this.funcionario = funcionario;
        this.dataPagamento = dataPagamento;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public int getID() {
        return ID;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public Descontos[] getListaDesconto() {
        return listaDesconto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void calcular() {
        this.calcular(null);
    }

    public void calcular(Descontos[] descontos) {
        this.calcular(descontos, null);
    }

    public void calcular(Descontos[] descontos, Double bonus) {
        //Aplicando as regras
        Double salarioBruto = funcionario.getSalarioBruto();
        Double salarioLiquido = salarioBruto;

        salarioLiquido -= getINSS(salarioBruto);
        salarioLiquido -= getImpostoRenda(salarioBruto);

        if (descontos != null){
            for (int i=0; i <descontos.length; i++){
                salarioLiquido -= descontos[i].getValor();
            }
        }
        if (bonus != null){
            salarioLiquido += bonus;
        }

        this.salarioLiquido = salarioLiquido;

    }

    public Double getImpostoRenda(Double salarioBruto) {
        Double desconto = 0.0;
        Double descontoPercentual = 0.0;

        if (salarioBruto <= 1903.98) {
            descontoPercentual = 0.0;
        } else if (salarioBruto <= 2826.65) {
            descontoPercentual = 7.5;
        } else if (salarioBruto <= 3751.05) {
            descontoPercentual = 15.0;
        } else if (salarioBruto <= 4664.68) {
            descontoPercentual = 22.5;
        } else {
            descontoPercentual = 27.5;
        }

        desconto = (salarioBruto * (descontoPercentual / 100));

        System.out.println("Imposto de renda: " + desconto);

        return desconto;
    }

    public Double getINSS(Double salarioBruto) {
        Double desconto = 0.0;

        if (salarioBruto > 1100.0) {
            desconto += (1100.0 * 0.075);
            salarioBruto -= 1100.00;

            if (salarioBruto > 2203.48) {
                desconto += (2203.48 * 0.09);
                salarioBruto -= 2203.48;

                if (salarioBruto > 3305.22) {
                    desconto += (3305.22 * 0.12);
                    salarioBruto -= 3305.22;

                    if (salarioBruto > 6433.57) {
                        desconto += (6433.57 * 0.14);
                    } else {
                        desconto += (salarioBruto * 0.14);
                    }
                } else {
                    desconto += (salarioBruto * 0.12);
                }
            } else {
                desconto += (salarioBruto * 0.09);
            }
        }else {
            desconto += (salarioBruto * 0.075);
        }

        System.out.println("INSS R$: " + desconto);
        return desconto;
    }

}