package distributedcomputingsister;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class EchoServer {
    public static final int SERVICE_PORT = 7;
    public static final int BuFSIZE = 4096;
    private DatagramSocket socket;

    public EchoServer(){
        try {
            socket = new DatagramSocket (SERVICE_PORT);
            System.out.println("Server active on port" + socket.getLocalPort());
        } catch (Exception e) {
            System.err.println("Unable to bind port");
        }
    }

    public void serviceClients(){
        byte[] buffer = new byte [BuFSIZE];

        for(;;){
            try {
                DatagramPacket packet = new DatagramPacket (buffer, BuFSIZE);
                socket.receive(packet);
                System.out.println("packet received from" + packet.getAddress() + packet.getPort() + "of length " + packet.getLength());
                socket.send(packet);
            } catch (IOException ioe) {
                System.err.println("Error :" + ioe);
            }
        }
    }

    public static void main (String args[]){
        EchoServer server = new EchoServer();
        server.serviceClients();
    }
}
