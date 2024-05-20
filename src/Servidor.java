import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) {
        try {
            // Cria uma instância do objeto remoto
            CalculadoraImpl obj = new CalculadoraImpl();

            // Cria o registro RMI na porta 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Registra o objeto remoto com um nome
            registry.rebind("Calculadora", obj);

            System.out.println("Servidor RMI pronto.");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

