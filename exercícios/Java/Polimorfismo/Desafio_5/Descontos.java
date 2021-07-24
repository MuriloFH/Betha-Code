package Desafio_5;

public class Descontos{

    private int ID;
    private String descricao;
    private Double valor;

    public Descontos(int ID, String descricao, Double valor) {
        this.ID = ID;
        this.descricao = descricao;
        this.valor = valor;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double calcular(){
        return valor;
    }

}
