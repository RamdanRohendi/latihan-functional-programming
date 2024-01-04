package javaio1.prak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

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
        } catch (IOException e) {
            System.err.println(e);
            return false;
        }

        return true;
    }

    boolean write_to_pw(PrintWriter pw) {
        pw.print(name);
        pw.print('|');
        pw.print(rooms);
        pw.print('|');
        pw.print(location);
        pw.println();

        return true;
    }

    boolean read_from_br(BufferedReader br) {
        try {
            String line = br.readLine();
            if (line == null) return false;
            StringTokenizer st = new StringTokenizer(line, "|");

            int count = st.countTokens();
            if (count < 3) return false;

            name = st.nextToken();
            String temp = st.nextToken();
            rooms = to_int(temp);
            location = st.nextToken();
        } catch (IOException e) {
            System.err.println(e);
            return false;
        }

        return true;
    }

    void debug_print() {
        System.out.println("Name :" + name + ": Rooms : " + rooms + ": at :" + location + ":");
    }

    static int to_int(String value) {
        int i = 0;

        try {
            i = Integer.parseInt(value);
        } catch (NumberFormatException e) {
        }

        return i;
    }
}