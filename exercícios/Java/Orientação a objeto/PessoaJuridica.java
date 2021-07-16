import javax.management.InstanceNotFoundException;

public class PessoaJuridica extends Pessoa{

    private Integer cnpj, inscricaoEstadual, cnae;

    public PessoaJuridica(Integer id, String nome, String endereco, Integer telefone, Integer cnpj, Integer inscricaoEstadual, Integer cnae) {
        super(id, nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnae = cnae;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(Integer inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Integer getCnae() {
        return cnae;
    }

    public void setCnae(Integer cnae) {
        this.cnae = cnae;
    }

    @Override
    public Integer getDocumentoPrincipal(){
        return cnpj;
    }
}
