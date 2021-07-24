package Desafio_5;

public class Funcionario {

    private int ID;
    private String nome, CPF;
    private Double salarioBruto;

    public Funcionario(int ID, String nome, String CPF, Double salarioBruto) {
        this.ID = ID;
        this.nome = nome;
        this.CPF = CPF;
        this.salarioBruto = salarioBruto;
    }

    public Funcionario(int ID, String nome, String CPF) {
        new Funcionario(ID,nome,CPF,null);
    }

    public Funcionario(int id, String nome) {
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }


}
