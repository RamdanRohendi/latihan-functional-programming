package polimorfisme.overriding.tugas;

public class Indonesia extends Negara {
    @Override
    void showData() {
        super.showData();
        System.out.println("Nama Negara\t\t: Negara Kesatuan Republik Indonesia");
        System.out.println("Jumlah Penduduk\t: 278.497.804");
    }
}
