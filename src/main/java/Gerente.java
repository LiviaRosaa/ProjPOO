// Livia Almeida Rosa
public class Gerente extends Pessoa { 
 private String setor;
 private int idGerente;

//construtor default
public Gerente() {
 this.setor = "";
 this.idGerente = 0;
}

// Encapsulamento
 public String getSetor() { return setor; }
 public void setSetor(String setor) { this.setor = setor; }
 public int getIdGerente() { return idGerente; }
 public void setIdGerente(int idGerente) { this.idGerente = idGerente; }

// Sobrescrita
@Override
public void exibirDetalhes() {
 System.out.println("Detalhes do Gerente:");
 System.out.println("Nome: " + getNome());
 System.out.println("CPF: " + getCpf());
 System.out.println("ID Gerente: " + idGerente);
 System.out.println("Setor: " + setor);
}

// Sobrescrita
@Override
 public String toString() {
 return "Gerente: " + getNome() + " (ID: " + idGerente + ")";
 }
}
