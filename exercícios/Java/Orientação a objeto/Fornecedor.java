public class Fornecedor extends PessoaJuridica{

    private String responsavel, observacao;

    public Fornecedor(Integer id, String nome, String endereco, Integer telefone, Integer cnpj, Integer inscricaoEstadual, Integer cnae, String responsavel, String observacao) {
        super(id, nome, endereco, telefone, cnpj, inscricaoEstadual, cnae);
        this.responsavel = responsavel;
        this.observacao = observacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
