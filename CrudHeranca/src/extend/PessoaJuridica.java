package extend;

public class PessoaJuridica extends Pessoa {
    // Atributos específicos da classe PessoaJuridica
    private String cnpj;


    // Construtor da classe PessoaJuridica
    public PessoaJuridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
       
    }

    // Método getter para o CNPJ
    public String getCnpj() {
        return cnpj;
    }

    // Método setter para o CNPJ
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método toString para exibir informações da PessoaJuridica
    @Override
    public String toString() {
        return "PessoaJuridica{" +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
