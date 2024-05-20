import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Obtém o registro RMI na porta 1099
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Obtém uma referência ao objeto remoto
            Calculadora stub = (Calculadora) registry.lookup("Calculadora");

            // Invoca os métodos remotos e imprime os resultados
            int a = 85;
            int b = 3;

            System.out.println("A soma é: " + stub.somar(a, b));
            System.out.println("A subtração é: " + stub.subtrair(a, b));
            System.out.println("A multiplicação é: " + stub.multiplicar(a, b));
            System.out.println("A divisão é: " + stub.dividir(a, b));
        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

