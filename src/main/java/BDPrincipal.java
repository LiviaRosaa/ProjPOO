//Livia Almeida Rosa
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDPrincipal {
private static BDPrincipal bdUnica; 


private List<Cliente> bdClientes;
private List<Funcionario> bdFuncionarios;
private List<Gerente> bdGerentes;
private List<Veiculo> bdVeiculos;
private List<RegistroEstacionamento> bdRegistros;

private BDPrincipal() { 
 bdClientes = new ArrayList<>();
 bdFuncionarios = new ArrayList<>();
 bdGerentes = new ArrayList<>();
 bdVeiculos = new ArrayList<>();
 bdRegistros = new ArrayList<>();
 }

//MÉTODO SINGLETON
public static BDPrincipal getBDPrincipal() { 
if (bdUnica == null) {
 bdUnica = new BDPrincipal();
}
return bdUnica;
}

//Reflexividade
public static Object buscarNomeReflexivo(Object obj) { 
        try {
            Method metodo = obj.getClass().getMethod("getNome"); 
            return metodo.invoke(obj);  
        } catch (Exception e) {
            System.out.println("Erro: Objeto não tem método 'getNome' ou problema na invocação. " + e.getMessage());
            return "Nome indisponivel";
        }
    }

public List<Cliente> getBdClientes() {return bdClientes;}
public List<Funcionario> getBdFuncionarios() {return bdFuncionarios;}
public List<Gerente> getBdGerentes() {return bdGerentes;}
public List<Veiculo> getBdVeiculos() {return bdVeiculos;}
public List<RegistroEstacionamento> getBdRegistros() {return bdRegistros;}

public Cliente insCliente(Cliente c) {
  if(consClienteCpf(c)== null){
            bdClientes.add(c);
            return c;
        }
        else{
            return null;
        }
    }

public Cliente consClienteCpf(Cliente c){
        for(int i = 0; i < bdClientes.size(); i++){
            if(c.getCpf() == bdClientes.get(i).getCpf()){
                    return bdClientes.get(i);
            }
        }
        return null;
    }

public Cliente delClienteCpf(Cliente c) {
    Cliente c1 = consClienteCpf(c);
        if(c1 != null){
            bdClientes.remove(c1);
            return null;
        }
        else{
            return c;
        }
    }

public Cliente atualizaClienteCpf(Cliente c) {
   for(int i = 0; i < bdClientes.size(); i++){
            if(c.getCpf() == bdClientes.get(i).getCpf()){
                c = bdClientes.get(i);

                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo Nome",
                    "Atulizar dados",
                    JOptionPane.INFORMATION_MESSAGE
                );

                c.setNome(nome);
                bdClientes.set(i, c);  
                return bdClientes.get(i);
            }
        }
        return null;
    }


//veiculo
public Veiculo insVeiculo(Veiculo v) {
        if (consVeiculoPlaca(v) == null) {
            bdVeiculos.add(v);
            return v;
        }
        return null; 
    }
    

public Veiculo consVeiculoPlaca(Veiculo v) {
    for (Veiculo veiculo : bdVeiculos) {
        if (veiculo.getPlaca().equalsIgnoreCase(v.getPlaca())) {
return veiculo;
            }
        }
return null; 
    }


public Veiculo delVeiculoPlaca(Veiculo v) {
       Veiculo veiculoRemover = consVeiculoPlaca(v);
    if (veiculoRemover != null) {
        bdVeiculos.remove(veiculoRemover);
return null;
        }
return v;
    }
    

public Veiculo atualizaVeiculoPlaca(Veiculo v) {
   for(int i = 0; i < bdVeiculos.size(); i++){
        if(v.getPlaca().equalsIgnoreCase(bdVeiculos.get(i).getPlaca())){
            v = bdVeiculos.get(i);

            String modelo = JOptionPane.showInputDialog(
                null,
                "Informe o novo Modelo",
                "Atualizar dados",
                JOptionPane.INFORMATION_MESSAGE
            );
            v.setModelo(modelo); 
            bdVeiculos.set(i, v);  
            return bdVeiculos.get(i);
        }
    }
    return null;
}

//Funcionario
public Funcionario insFuncionario(Funcionario f) {
        if (consFuncionarioCpf(f) == null) {
            bdFuncionarios.add(f);
            return f;
        }
        return null; 
    }
    

public Funcionario consFuncionarioCpf(Funcionario f) {
    for (Funcionario funcionario : bdFuncionarios) {
        if (funcionario.getCpf() == f.getCpf()) {
        return funcionario;
         }
    }
return null; 
}

public Funcionario delFuncionarioCpf(Funcionario f) {
       Funcionario funcRemover = consFuncionarioCpf(f);
    if (funcRemover != null) {
        bdFuncionarios.remove(funcRemover);
   return null;
    }
return f;
}
    
public Funcionario atualizaFuncionarioCpf(Funcionario f) {
    for(int i = 0; i < bdFuncionarios.size(); i++){
        if(f.getCpf() == bdFuncionarios.get(i).getCpf()){
            f = bdFuncionarios.get(i);

            String nome = JOptionPane.showInputDialog(
                null,
                "Informe o novo Nome",
                "Atualizar dados",
                JOptionPane.INFORMATION_MESSAGE
            );
            f.setNome(nome);
            bdFuncionarios.set(i, f);  
            return bdFuncionarios.get(i);
        }
    }
    return null;
}

//Gerente
//Gerente só existe se ja for um funcionario...
public Gerente insGerente(Gerente g) {
    Funcionario fBusca = new Funcionario();
    fBusca.setCpf(g.getCpf());
    
    Funcionario funcionarioExistente = consFuncionarioCpf(fBusca);
    
    if (funcionarioExistente == null) {
        return null; 
    }
    
    Gerente gerenteExistente = consGerenteCpf(g);
    
    if (gerenteExistente == null) {
        bdGerentes.add(g);
        return g;
    } else {
        return null; 
    }
}

public Gerente consGerenteCpf(Gerente g) {
   for (Gerente gerente : bdGerentes) {
      if (gerente.getCpf() == g.getCpf()) {
       return gerente;
       }
    }
return null; 
 }

public Gerente delGerenteCpf(Gerente g) {
       Gerente gerenteRemover = consGerenteCpf(g);
    if (gerenteRemover != null) {
        bdGerentes.remove(gerenteRemover);
return null;
    }
return g;
}

public Gerente atualizaGerenteCpf(Gerente g) {
   for(int i = 0; i < bdGerentes.size(); i++){
        if(g.getCpf() == bdGerentes.get(i).getCpf()){
            g = bdGerentes.get(i);
            String nome = JOptionPane.showInputDialog(
                null,
                "Informe o novo Nome",
                "Atualizar dados",
                JOptionPane.INFORMATION_MESSAGE
            );
            g.setNome(nome);
            bdGerentes.set(i, g);  
            return bdGerentes.get(i);
        }
    }
    return null;
}

//Registro e Estacionamento 
public RegistroEstacionamento insRegistro(RegistroEstacionamento r) {
        String placa = r.getVeiculo().getPlaca();
        if (consRegistroAtivoPlaca(placa) == null) { 
            bdRegistros.add(r);
            return r;
        }
        return null; 
    }
    

public RegistroEstacionamento consRegistroAtivoPlaca(String placa) {
    for (RegistroEstacionamento registro : bdRegistros) {
        if (registro.getVeiculo().getPlaca().equalsIgnoreCase(placa) && registro.getHoraSaida() == null) {
        return registro;
        }
    }
return null; 
}


public RegistroEstacionamento registrarSaida(String placa) {
    RegistroEstacionamento registro = consRegistroAtivoPlaca(placa);
    if (registro != null) {
        registro.setHoraSaida(); 
        return registro;
    }
return null; 
}

public RegistroEstacionamento delRegistro(RegistroEstacionamento r) {
    if (bdRegistros.remove(r)) {
return null;
    }
  return r;
}

}