package observer;

public interface Acao {
    void setValor(String valor);
    void registrarCliente(Cliente cliente);
    void removerCliente(Cliente cliente);
    void notificarClientes();
}