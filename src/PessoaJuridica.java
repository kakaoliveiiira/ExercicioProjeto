public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String nomeFantasia;
    private String razaoSocial;

    public PessoaJuridica() {
        super(null);
    }

    public PessoaJuridica(String nome, String cnpj, String inscricaoEstadual, String nomeFantasia, String razaoSocial) {
        super(nome);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Razão Social: " + razaoSocial);
    }
}
