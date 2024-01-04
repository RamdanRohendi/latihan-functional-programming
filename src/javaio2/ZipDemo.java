package javaio2;

import java.io.FileOutputStream;
import java.util.zip.*;
import java.io.*;

public class ZipDemo {
    public static void main(String args[]) {
        try {
            FileOutputStream fos = new FileOutputStream("sample.zip");
            ZipOutputStream zipOS = new ZipOutputStream(fos);

            String file1 = "example1.txt";
            String file2 = "example2.txt";
            String file3 = "example3.txt";

            writeZipFile(file1, zipOS);
            writeZipFile(file2, zipOS);
            writeZipFile(file3, zipOS);

            zipOS.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeZipFile(String path, ZipOutputStream zipStream) throws FileNotFoundException, IOException {
        System.out.println("Writing file : '" + path + "' to zip file");
        File aFile = new File(path);
        FileInputStream fis = new FileInputStream(aFile);
        ZipEntry zipEntry = new ZipEntry(path); zipStream.putNextEntry(zipEntry);

        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipStream.write(bytes, 0, length);
        }

        zipStream.closeEntry(); fis.close();
    }
}
