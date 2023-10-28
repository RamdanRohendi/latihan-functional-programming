package clientserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DataInterface extends Remote {
    void FirstMethod() throws RemoteException;
    void SecondMethod() throws RemoteException;

}

