package extend;

public class Main {
    public static void main(String[] args) {
        // Criar uma pessoa física
        PessoaFisica pessoaFisica = new PessoaFisica("Maria", 25, "123.456.789-00");
        System.out.println("Pessoa Física:");
        System.out.println(pessoaFisica.toString());

        // Criar uma pessoa jurídica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", 10, "12345/0001-67", "XYZ Ltda");
        System.out.println("\nPessoa Jurídica:");
        System.out.println(pessoaJuridica.toString());

        // Criar uma pessoa comum
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println("\nPessoa Comum:");
        System.out.println(pessoa.toString());

        // Criar uma PessoaPessoa (anteriormente chamada de Pessoa)
        PessoaPessoa pessoaPessoa = new PessoaPessoa("Ana", 40);
        System.out.println("\nPessoa Pessoa:");
        System.out.println(pessoaPessoa.toString());
    }
}
