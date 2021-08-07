package Desafio_6.model;

import java.math.BigDecimal;

public class Cliente extends AbstractPessoa{

    private BigDecimal percentualDescontoMaximo;

    public Cliente(Long id, String nome, String cpf, String endereco, String telefone, BigDecimal percentualDescontoMaximo) {
        super(id, nome, cpf, endereco, telefone);
        this.percentualDescontoMaximo = percentualDescontoMaximo;
    }

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public BigDecimal getPercentualDescontoMaximo() {
        return percentualDescontoMaximo;
    }

    public void setPercentualDescontoMaximo(BigDecimal percentualDescontoMaximo) {
        this.percentualDescontoMaximo = percentualDescontoMaximo;
    }
}
