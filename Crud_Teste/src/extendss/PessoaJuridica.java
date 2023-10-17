package extendss;

public class PessoaJuridica extends Pessoa {
	  private String cnpj;
	 

	    // Construtor da classe PessoaJuridica
	    public PessoaJuridica(String nome, int idade, String cnpj, String razaoSocial) {
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

}
