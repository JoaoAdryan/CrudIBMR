package extensao;

public class PessoaFisica extends Pessoa implements OperacoesCRUD {
    private int cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void criar() {
        System.out.println("Criando Pessoa Física: " + getNome());
    }

    @Override
    public void ler() {
        System.out.println("Lendo Pessoa Física: " + getNome());
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando Pessoa Física: " + getNome());
    }

    @Override
    public void deletar() {
        System.out.println("Deletando Pessoa Física: " + getNome());
    }
}

