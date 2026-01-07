// Livia Almeida Rosa
import java.time.LocalDateTime;
import java.time.Duration;

public class RegistroEstacionamento implements Pagamento { 
  private Cliente cliente;
  private Funcionario funcionario;
  private Veiculo veiculo;
  private LocalDateTime horaEntrada;
  private LocalDateTime horaSaida;

  //construtor default
public RegistroEstacionamento() {
 this.cliente = null;
 this.funcionario = null;
 this.veiculo = null;
 this.horaEntrada = null;
 this.horaSaida = null;
}

// Encapsulamento
 public Cliente getCliente() { return cliente; }
 public void setCliente(Cliente cliente) { this.cliente = cliente; }
 public Funcionario getFuncionario() { return funcionario; }
 public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }
 public Veiculo getVeiculo() { return veiculo; }
 public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
 public LocalDateTime getHoraEntrada() { return horaEntrada; }
 
public void setHoraEntrada() {
 this.horaEntrada = LocalDateTime.now();
 }

public LocalDateTime getHoraSaida() { return horaSaida; }
 public void setHoraSaida() {
 this.horaSaida = LocalDateTime.now();
}

// Sobrescrita
@Override
public double calcularValor(){
    final double VALOR_FIXO = 10.0;
    return VALOR_FIXO;
}

// Sobrescrita
@Override 
public String toString() {
 String saida = (horaSaida != null) ? horaSaida.toString() : "EM ESTACIONAMENTO";
  return "Registro [Cliente=" + (cliente != null ? cliente.getNome() : "N/A") +
  ", Veiculo=" + (veiculo != null ? veiculo.getPlaca() : "N/A") +
  ", Entrada=" + horaEntrada +
  ", Saída=" + saida + "]";
}

    Object getGerente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
