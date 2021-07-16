public class PessoaFisica extends Pessoa{

    private Integer cpf, rg;
    private String sexo;

    public PessoaFisica(Integer id, String nome, String endereco, Integer telefone, Integer cpf, Integer rg, String sexo) {
        super(id, nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public Integer getDocumentoPrincipal(){
        return cpf;
    }
}

