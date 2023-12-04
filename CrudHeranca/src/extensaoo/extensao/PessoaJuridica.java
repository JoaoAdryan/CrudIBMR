package extensao;

public class PessoaJuridica extends Pessoa implements OperacoesCRUD {
    private long cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, long cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void criar() {
        System.out.println("Criando Pessoa Jurídica: " + getNome());
    }

    @Override
    public void ler() {
        System.out.println("Lendo Pessoa Jurídica: " + getNome());
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando Pessoa Jurídica: " + getNome());
    }

    @Override
    public void deletar() {
        System.out.println("Deletando Pessoa Jurídica: " + getNome());
    }


    @Override
    public String getNome() {
        return "Pessoa Jurídica: " + super.getNome();
    }
}