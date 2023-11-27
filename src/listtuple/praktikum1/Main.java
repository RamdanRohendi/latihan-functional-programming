package listtuple.praktikum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListMenu listMenu = new ListMenu();

        do {
            System.out.println("===== MenuKu =====");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Tambah Menu");
            System.out.println("3. Ubah Menu");
            System.out.println("4. Hapus Menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            int pilihanMenu = in.nextInt();

            System.out.println();
            switch (pilihanMenu) {
                case 1:
                    System.out.println("==> List Menu :");
                    System.out.println(">> Makanan");
                    if (listMenu.getJml("Makanan") > 0) {
                        listMenu.getMenuList().stream()
                                .filter(menu -> menu.getJenis().equals("Makanan"))
                                .forEach(menu -> System.out.println("[" + listMenu.getMenuList().indexOf(menu) + "] " + menu.getNama() + " [Rp" + String.format("%,d", menu.getHarga()).replace(",", ".") + "]"));
                    } else {
                        System.out.println("(Belum Tersedia)");
                    }

                    System.out.println();
                    System.out.println(">> Minuman");
                    if (listMenu.getJml("Minuman") > 0) {
                        listMenu.getMenuList().stream()
                                .filter(menu -> menu.getJenis().equals("Minuman"))
                                .forEach(menu -> System.out.println("[" + listMenu.getMenuList().indexOf(menu) + "] " + menu.getNama() + " [Rp" + String.format("%,d", menu.getHarga()).replace(",", ".") + "]"));
                    } else {
                        System.out.println("(Belum Tersedia)");
                    }
                    break;
                case 2:
                    System.out.println("==> Tambah Menu :");
                    System.out.println("Pilih Jenis :");
                    System.out.println("1. Makanan");
                    System.out.println("2. Minuman");
                    System.out.print("Pilih : ");
                    int pilihanJenis = in.nextInt();
                    String jenis;

                    if (pilihanJenis == 1) {
                        jenis = "Makanan";
                    } else if (pilihanJenis == 2) {
                        jenis = "Minuman";
                    } else {
                        jenis = "NULL";
                        System.out.println("Pilihan anda tidak ada.");
                    }

                    if (!jenis.equals("NULL")) {
                        System.out.println();
                        System.out.print("Masukkan Nama  : ");
                        String nama = in.next();
                        System.out.print("Masukkan Harga : ");
                        int harga = in.nextInt();

                        listMenu.addMenu(new Menu(jenis, nama, harga));
                        System.out.println("Menu berhasil dimasukkan.");
                    }
                    break;
                case 3:
                    System.out.println("==> Ubah Menu :");
                    System.out.print("Masukkan Index Menu : ");
                    int indexEdit = in.nextInt();

                    if (listMenu.isAda(indexEdit)) {
                        Menu menu = listMenu.getOneMenu(indexEdit);

                        System.out.println();
                        System.out.println("Data yang dipilih :");
                        System.out.println("Jenis : " + menu.getJenis());
                        System.out.println("Nama  : " + menu.getNama());
                        System.out.println("Harga : " + menu.getHarga());

                        System.out.println();
                        System.out.print("Masukkan Nama Baru : ");
                        menu.setNama(in.next());
                        System.out.print("Masukkan Harga Baru : ");
                        menu.setHarga(in.nextInt());

                        listMenu.changeMenu(indexEdit, menu);
                        System.out.println("Menu berhasil diubah.");
                    } else {
                        System.out.println("Item tidak ada.");
                    }
                    break;
                case 4:
                    System.out.println("==> Hapus Menu :");
                    System.out.print("Masukkan Index Menu : ");
                    int indexHapus = in.nextInt();

                    if (listMenu.isAda(indexHapus)) {
                        Menu menu = listMenu.getOneMenu(indexHapus);

                        System.out.println();
                        System.out.println("Data yang dipilih :");
                        System.out.println("Jenis : " + menu.getJenis());
                        System.out.println("Nama  : " + menu.getNama());
                        System.out.println("Harga : " + menu.getHarga());

                        System.out.println();
                        System.out.println("Yakin ingin dihapus?");
                        System.out.println("Ketik \"Yakin\" (Tanpa kutip) untuk konfirmasi.");
                        System.out.print("Input : ");
                        String yakinHapus = in.next();

                        if (yakinHapus.equals("Yakin")) {
                            listMenu.removeMenu(indexHapus);
                            System.out.println("Menu berhasil dihapus.");
                        } else {
                            System.out.println("Menu tidak jadi dihapus.");
                        }
                    } else {
                        System.out.println("Item tidak ada.");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang anda pilih tidak ada.");
                    break;
            }

            System.out.println();
            System.out.println();
        } while (true);
    }
}
