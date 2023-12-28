package distributedcomputingsister;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpMengirimInformasi {
    public static void main(String[] args) {
        System.out.println ("paket send");
        String hostname = "localhost";
        System.out.println("Binding to a local port");

        try (DatagramSocket socket = new DatagramSocket()){
            System.out.println("Bound to local port " + socket.getLocalPort());
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);
            pout.print("Hai Hai");
//            byte[] barray = bout.toByteArray();
            String barray = "a";
            DatagramPacket packet = new DatagramPacket (barray.getBytes(), barray.length());
            System.out.println("looking up hostname " + hostname);
            InetAddress remote_addr = InetAddress.getByName(hostname);
            System.out.println("hostname resolved : " + remote_addr.getHostAddress());
            packet.setAddress(remote_addr);
            packet.setPort(2000);
            socket.send(packet);
            System.out.println("Packet sent");
        } catch (SocketException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
