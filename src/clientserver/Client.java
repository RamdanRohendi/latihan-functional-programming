package clientserver;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args)  throws  NotBoundException, MalformedURLException, RemoteException{
        DataInterface data = (DataInterface) Naming.lookup("data");
        System.out.println("Client conect ke server");
        data.FirstMethod();
        data.SecondMethod();
        System.out.println("Selesai");

    }
}
