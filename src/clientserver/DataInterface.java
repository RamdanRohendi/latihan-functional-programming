package clientserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DataInterface extends Remote {
    public void FirstMethod() throws RemoteException;
    public void SecondMethod() throws RemoteException;

}

