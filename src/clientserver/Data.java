package clientserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Data extends UnicastRemoteObject implements DataInterface{
    public Data() throws RemoteException{
    }
    public void FirstMethod() throws RemoteException{
        System.out.println("Menjalankan method pertama");
    }
    
    public void SecondMethod() throws RemoteException{
        System.out.println("Menjalankan method Kedua");
    }
}
