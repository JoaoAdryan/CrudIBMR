package extensao;

public class Main {
    public static void main(String[] args) {
        
        OperacoesCRUD operacoesPessoaFisica = new PessoaFisica("João", 123456789);
        operacoesPessoaFisica.criar();
        operacoesPessoaFisica.ler();

        OperacoesCRUD operacoesPessoaJuridica = new PessoaJuridica("Empresa XYZ", 987654321);
        operacoesPessoaJuridica.criar();
        operacoesPessoaJuridica.ler();
    }
}
