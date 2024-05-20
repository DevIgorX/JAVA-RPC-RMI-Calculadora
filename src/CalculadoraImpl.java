import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    protected CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public int somar(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public double dividir(int a, int b) throws RemoteException {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero.");
        }
        return (double) a / b;
    }
}

