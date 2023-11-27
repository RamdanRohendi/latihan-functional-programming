package listtuple;

public class TestString {
    public static void main(String[] args) {
        String kata1 = "Hallo";
        String kata2 = "Hai";

        System.out.println("Panjang String Pertama: " + kata1.length());
        System.out.println("Panjang String Kedua: " + kata2.length());

        // Menggabungkan String kata1 dan kata2 menggunakan fungsi concat()
        String gabunganKata = kata1.concat(kata2);
        System.out.println("Gabungan kedua String: " + gabunganKata);

        // Mengganti huruf H menjadi A menggunakan fungsi replace()
        System.out.println("Isi kata1 setelah diganti: " + kata1.replace('H', 'A'));
        System.out.println("Isi kata2 setelah diganti: " + kata2.replace('H', 'A'));
    }
}
