package listtuple.praktikum1;

public class Menu {
    private final String jenis;
    private String nama;
    private int harga;

    public Menu(String jenis, String nama, int harga) {
        this.jenis = jenis;
        this.nama = nama;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
