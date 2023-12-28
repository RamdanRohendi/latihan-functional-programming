package distributedcomputingsister;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ConMengirimPaket{
    public static void main (String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket socket = new DatagramSocket ();
        String message = "hai hai";
        DatagramPacket packet = new DatagramPacket (message.getBytes(), message.length(), InetAddress.getLocalHost(), 2000);
        socket.send(packet);
        socket.close();

    }
}
