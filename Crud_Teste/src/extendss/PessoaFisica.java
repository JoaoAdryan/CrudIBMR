package extendss;

public class PessoaFisica extends Pessoa {
	  // Atributo específico da classe PessoaFisica
    private String cpf;

    // Construtor da classe PessoaFisica
    public PessoaFisica(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    // Método getter para o CPF
    public String getCpf() {
        return cpf;
    }

    // Método setter para o CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
