// Livia Almeida Rosa
public class Funcionario extends Pessoa { // Herança: Funcionario é um tipo de Pessoa.
    private int idFuncionario;
    private double salario;

//construtor default
public Funcionario() {
 this.idFuncionario = 0;
 this.salario = 0.0;
 }

// Encapsulamento
 public int getIdFuncionario() { return idFuncionario; }
 public void setIdFuncionario(int idFuncionario) { this.idFuncionario = idFuncionario; }
 public double getSalario() { return salario; }
 public void setSalario(double salario) { this.salario = salario; }

// Sobrescrita
@Override
public void exibirDetalhes() {
 System.out.println("Detalhes do Funcionário:");
 System.out.println("Nome: " + getNome());
 System.out.println("CPF: " + getCpf());
 System.out.println("ID Funcionário: " + idFuncionario);
 System.out.println("Salário: R$" + salario);
}

// Sobrescrita
 @Override
  public String toString() {
  return "Funcionario: " + getNome() + " (ID: " + idFuncionario + ")";
   }
}