package Desafio_6.model;

import java.math.BigDecimal;

public class Vendedor extends AbstractPessoa{

    private BigDecimal percentualComissao;

    public Vendedor(Long id, String nome, String cpf, String endereco, String telefone, BigDecimal percentualComissao) {
        super(id, nome, cpf, endereco, telefone);
        this.percentualComissao = percentualComissao;
    }

    public Vendedor(String nome, String cpf, BigDecimal percentualComissao) {
        super(nome, cpf);
        this.percentualComissao = percentualComissao;
    }

    public BigDecimal getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(BigDecimal percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
