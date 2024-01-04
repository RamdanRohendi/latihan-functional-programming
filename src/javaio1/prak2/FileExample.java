package javaio1.prak2;

import java.io.*;
import java.util.*;

public class FileExample {
    static BufferedReader system_in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String arg[]) {
        // Create it
        {
            try {
                FileOutputStream fos = new FileOutputStream("file.txt");

                // Read in three hotels
                for (int i = 0; i < 3; i++) {
                    Hotel a_hotel = new Hotel();
                    a_hotel.input(system_in);
                    a_hotel.write_to_fos(fos);
                }

                fos.close();
            } catch(IOException e) {
                System.out.println(e);
            }
        }

        // Now display it
        {
            byte [] buffer = null;
            File a_file = new File("file.txt");
            System.out.println("Length is " + a_file.length());
            System.out.println(" Can read " + a_file.canRead());

            try {
                FileInputStream fis = new FileInputStream(a_file);
                int length = (int) a_file.length();
                buffer = new byte[length];
                fis.read(buffer);
                fis.close();
            } catch(IOException e) {
                System.out.println(e);
            }

            String s = new String(buffer);
            System.out.println("Buffer is " + s);
        }
    }
}
