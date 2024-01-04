package javaio2;

import java.io.*;
import java.util.*;
import java.util.zip.*;

public class ReadZipFile {
    private static void read(String zipFilePath) {
        try {
            ZipFile zipFile = new ZipFile(zipFilePath);

            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                String name = entry.getName();
                long compressedSize = entry.getCompressedSize();
                long normalSize = entry.getSize();
                String type = entry.isDirectory() ? "DIR" : "FILE";

                System.out.println(name);
                System.out.format("\t %s - %d - %d\n", type, compressedSize, normalSize);
            }

            zipFile.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static void main(String[] args) {
        String zipFilePath = "sample.zip";
        read(zipFilePath);
    }
}
