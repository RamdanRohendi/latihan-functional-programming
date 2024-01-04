package javaio1.prak1;

import java.io.*;
import java.util.*;

class ReaderExample {
    static BufferedReader system_in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String argv[]) {
        // Create it
        {
            try {
                FileOutputStream fos = new FileOutputStream("text.txt");
                PrintWriter pw = new PrintWriter(fos);

                for (int i = 0; i < 3; i++) {
                    Hotel a_hotel = new Hotel();
                    a_hotel.input(system_in);
                    a_hotel.write_to_pw(pw);
                }

                pw.close();
            } catch(IOException e) {
                System.err.println(e);
            }
        }

        {
            try {
                FileReader fr = new FileReader("text.txt");
                BufferedReader br = new BufferedReader(fr);
                Hotel a_hotel = new Hotel();

                while (a_hotel.read_from_br(br)) {
                    a_hotel.debug_print();
                }

                br.close();
            } catch(IOException e) {
                System.err.println(e);
            }
        }
    }
}
