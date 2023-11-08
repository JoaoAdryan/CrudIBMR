package extend;

public class Pessoa {
    // Atributos da classe Pessoa
   
    private String nome;
    private int idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método toString para exibir informações da pessoa
    @Override
    public String toString() {
        return "Pessoa{" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
