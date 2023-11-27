package listtuple.praktikum2;

import org.javatuples.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class TransaksiWithTuple {
    public static void main(String[] args) {
        // Isi Data :
        // ID Transaksi, Keterangan/Deskripsi, Total Transaksi, Tanggal, Tervalidasi
        Quartet<Long, String, Double, String> riwayat1 = Quartet.with(getID(), "Pembelian Barang A", 50000.00, getDate());

        // Penambahan
        Quintet<Long, String, Double, String, Boolean> riwayat2 = riwayat1.setAt0(getID()).add(true);

        // Pengubahan
        Quintet<Long, String, Double, String, Boolean> riwayat3 = riwayat2.setAt0(getID()).setAt4(false);

        // Penghapusan
        Quartet<Long, String, Double, String> riwayat4 = riwayat3.setAt0(getID()).removeFrom4();

        System.out.println(riwayat1);
        System.out.println(riwayat2);
        System.out.println(riwayat3);
        System.out.println(riwayat4);
    }

    public static long getID() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Random rand = new Random();

        return rand.nextInt(1000) + timestamp.getTime() - rand.nextInt(1000);
    }

    public static String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        return dtf.format(now);
    }
}
