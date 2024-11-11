public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public PessoaFisica() {
        super(null);
    }

    public PessoaFisica(String nome, String cpf, String dataNascimento) {
        super(nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
}
