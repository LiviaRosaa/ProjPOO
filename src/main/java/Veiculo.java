// Livia Almeida Rosa
public class Veiculo {
  private String placa;
  private String modelo;
  private String cor;

  //construtor default
public Veiculo() {
 this.placa = "";
 this.modelo = "";
 this.cor = "";
}

// Encapsulamento
public String getPlaca() { return placa; }
public void setPlaca(String placa) { this.placa = placa; }
public String getModelo() { return modelo; }
public void setModelo(String modelo) { this.modelo = modelo; }
public String getCor() { return cor; }
public void setCor(String cor) { this.cor = cor; }

// Sobrecarga 
public void exibirInformacoes() {
 System.out.println("Informações do Veículo: " + this.toString());
}

public void exibirInformacoes(String formato) {
 //Sobrecarga
  if (formato.equals("simples")) {
   System.out.println("Placa: " + getPlaca() + ", Modelo: " + getModelo());
   }else{
    System.out.println(this.toString());
     }
}

// Sobrescrita 
@Override
  public String toString() {
  return "Veículo [Placa=" + placa + ", Modelo=" + modelo + ", Cor=" + cor + "]";
 }
}
