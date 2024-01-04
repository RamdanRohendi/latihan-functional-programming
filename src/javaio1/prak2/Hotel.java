package javaio1.prak2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hotel {
    private String name;
    private int rooms;
    private String location;

    boolean input(BufferedReader in) {
        try {
            System.out.println("Name: ");
            name = in.readLine();
            System.out.println("Rooms: ");
            String temp = in.readLine();
            rooms = to_int(temp);
            System.out.println("Location: ");
            location = in.readLine();
        } catch(IOException e) {
            System.err.println(e);
            return false;
        }

        return true;
    }

    boolean write_to_fos(FileOutputStream fos) {
        try {
            fos.write(name.getBytes());
            Integer i = new Integer(rooms);
            fos.write(i.toString().getBytes());
            fos.write(location.getBytes());
            fos.write(' ');
        } catch (IOException e) {
            System.err.println(e);
            return false;
        }

        return true;
    }

    void debug_print() {
        System.out.println("Name :" + name + ": Rooms : " + rooms + ": at :" + location+ ":");
    }

    static int to_int(String value) {
        int i = 0;

        try {
            i = Integer.parseInt(value);
        } catch(NumberFormatException e) {}

        return i;
    }
}
