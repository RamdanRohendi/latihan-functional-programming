package clientserver;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args)  throws RemoteException, NotBoundException{
        Registry registry = LocateRegistry.createRegistry(1099);
        Data data = new Data();
        registry.rebind("data", data);
        System.out.println("Server running");

    }    
    
}
