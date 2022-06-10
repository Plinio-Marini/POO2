package observer;
import java.util.ArrayList;

public class Servidor implements Acao{
    public ArrayList<Cliente> clientes;
    public String valor;

    public Servidor(){
        clientes = new ArrayList<Cliente>();
    }

    public void setValor(String valor){
        this.valor = valor;
        valoresAlterados();
    }

    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente){
        int indice = clientes.indexOf(cliente);
        if(indice >= 0){
            clientes.remove(indice);
        }
    }

    public void notificarClientes(){
        for(Cliente cliente : clientes){
            cliente.atualizar(valor);
        }
    }

    public void valoresAlterados(){
        notificarClientes();
    }
}
