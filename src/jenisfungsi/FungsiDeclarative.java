package jenisfungsi;

public class FungsiDeclarative {
    public static void main(String[] args) {
        String kalimat = "Kalimat Awal";

        System.out.println("Default\t\t: " + kalimat);
        System.out.println("Ditambah\t: " + tambahKata(kalimat, " Yang Ditambah"));
        System.out.println("Default\t\t: " + kalimat);
    }

    static String tambahKata(String kalimat, String tambahan) {
        return kalimat + tambahan;
    }
}
