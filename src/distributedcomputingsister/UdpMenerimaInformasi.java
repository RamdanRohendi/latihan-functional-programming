package distributedcomputingsister;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpMenerimaInformasi {
    public static void main(String[] args) {
        System.out.println ("paket receive");
        System.out.println ("Binding to local port 2000");

        try (DatagramSocket socket = new DatagramSocket(2000)){
            System.out.println("Bound to local port " + socket.getLocalPort());
            DatagramPacket packet = new DatagramPacket (new byte[256], 256);
            socket.receive(packet);
            System.out.println("Packet receive");
            InetAddress remote_addr = packet.getAddress();
            System.out.println("sent by : " + remote_addr.getHostAddress());
            System.out.println("Sent from: " + packet.getPort());
            ByteArrayInputStream bin = new ByteArrayInputStream (packet.getData());
            BufferedReader br = new BufferedReader (new InputStreamReader(bin));
            System.out.print("Message : " + br.readLine());
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());

        }
    }
}
