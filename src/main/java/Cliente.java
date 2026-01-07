// Livia Almeida Rosa
public class Cliente extends Pessoa { 
 private int idCliente;
 private int rg; 

public Cliente() {
 this.idCliente = 0;
 this.rg = 0; 

}

// Encapsulamento
 public int getIdCliente() { return idCliente; }
 public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
 public int getRg() { return rg; }
 public void setRg(int rg) { this.rg = rg; }

// Sobrescrita
@Override
public void exibirDetalhes() {
 System.out.println("Detalhes do Cliente:");
 System.out.println("Nome: " + getNome());
 System.out.println("CPF: " + getCpf());
 System.out.println("ID Cliente: " + idCliente);
 System.out.println("RG: " + rg);
}

 // Sobrescrita
@Override
 public String toString() {
 return "Cliente: " + getNome() + " (ID: " + idCliente + ")";
 }

} 
