// Livia Almeida Rosa
import java.io.Serializable;

public abstract class Pessoa implements Serializable {
    private int cpf;
    private String nome;

    //construtor default
    public Pessoa() {
        this.cpf = 0;
        this.nome = "";
    }

    // Encapsulamento
    public int getCpf() { return cpf; }
    public void setCpf(int cpf) { this.cpf = cpf; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // Método Abstrato
    public abstract void exibirDetalhes();

    // Sobrescrita
    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf;
    }
}