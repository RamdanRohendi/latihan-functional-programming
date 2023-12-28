package distributedcomputingsister;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class EchoClient {
    public static final int SERVICE_PORT = 7;
    public static final int BuFSIZE = 256;
    public static void main (String[] args) throws SocketException, IOException{
        String hostname = "localhost";
        InetAddress addr = InetAddress.getByName(hostname);
        DatagramSocket socket = new DatagramSocket();
        socket.setSoTimeout(2000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (;;){
            System.out.println("tulis pesanmy....");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);
            pout.print(reader.readLine());
            byte[] barray = bout.toByteArray();
            DatagramPacket packet = new DatagramPacket(barray, barray.length, addr, SERVICE_PORT);
            System.out.println("sending for packet");
            socket.send(packet);
            System.out.println("waiting for packet");
            byte[] recbuf = new byte [BuFSIZE];
            DatagramPacket receivPacket = new DatagramPacket(recbuf, BuFSIZE);
            boolean timeout = false;

            try {
                socket.receive(receivPacket);
            } catch (InterruptedIOException oie) {
                timeout = true;
            }

            if (!timeout){
                System.out.println("packet receive");
                System.out.println("details" + receivPacket.getAddress());
                ByteArrayInputStream bin = new ByteArrayInputStream(receivPacket.getData(), 0, receivPacket.getLength());
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(bin));
                System.out.println((reader2.readLine()));
            } else {
                System.out.println("packet lost");
            }
        }
    }

}
