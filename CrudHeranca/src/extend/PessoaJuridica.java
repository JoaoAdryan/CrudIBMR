package extend;

public class PessoaJuridica extends Pessoa {
    // Atributos específicos da classe PessoaJuridica
    private String cnpj;
    private String razaoSocial;

    // Construtor da classe PessoaJuridica
    public PessoaJuridica(String nome, int idade, String cnpj, String razaoSocial) {
        super(nome, idade);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // Método getter para o CNPJ
    public String getCnpj() {
        return cnpj;
    }

    // Método setter para o CNPJ
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método getter para a Razão Social
    public String getRazaoSocial() {
        return razaoSocial;
    }

    // Método setter para a Razão Social
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    // Método toString para exibir informações da PessoaJuridica
    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
