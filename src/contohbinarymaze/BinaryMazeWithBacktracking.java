package contohbinarymaze;

public class BinaryMazeWithBacktracking {
    static boolean[][] visited;

    // Fungsi untuk mengecek apakah jalur atau titik yang dituju itu aman atau tidak
    // Aman disini iyalah bukan 0 dan tidak keluar denah
    // Juga bukan jalur atau titik yang sebelumnya telah dikunjungi atau dicek
    static boolean isSafe(int[][] mat, boolean[][] visited, int x, int y) {
        return (x >= 0 && x < mat.length && y >= 0 && y < mat[0].length && mat[x][y] == 1 && !visited[x][y]);
    }

    // Fungsi untuk mencari rute tercepat atau terpendek (intinya)
    // Fungsi ini merupakan Fungsi Rekursif
    // mat -> denah
    // i -> koordinat x lokasi awal (Baris berapa)
    // j -> koordinat y lokasi awal (Kolom berapa)
    // x -> koordinat x lokasi tujuan (Baris berapa)
    // y -> koordinat y lokasi tujuan (Kolom berapa)
    // min_dist -> Jumlah default/awal adalah jumlah MAX INTEGER
    // nantinya min_dist akan menyimpan value dari rute/jalur yang pertama dilalui
    // dist -> Jumlah default/awal adalah 0
    // nantinya dist akan menyimpan semua jumlah kemungkinan rute/jalur yang ada menuju lokasi tujuan
    static int findShortestPath(int[][] mat, int i, int j, int x, int y, int min_dist, int dist) {
        // Info cek mulai
        // Hanya sekedar visual dari pengecekan
        // Bisa dihilangkan
        System.out.println();
        for (int a = 0; a < visited.length; a++) {
            System.out.print("[");
            for (int b = 0; b < visited[0].length; b++) {
                if (a == i && b == j) {
                    System.out.print(" P ");
                } else {
                    System.out.print(" " + (visited[a][b] ? "O" : "X") + " ");
                }
            }
            System.out.println("]");
        }
        System.out.println("koordinat sekarang: (" + i + ", " + j + ")");
        System.out.println("min_dist: " + min_dist);
        System.out.println("dist: " + dist);
        // Info cek akhir

        if (i == x && j == y) {
            // Apabila i dan j (lokasi sekarang)
            // sudah berada atau sama dengan tepat di lokasi tujuan (x dan y)
            min_dist = Math.min(dist, min_dist); // Mengambil nilai terkecil antara dist dan min_dist
            return min_dist;
        }

        // Set lokasi i dan j  (lokasi sebelumnya)
        // Menjadi sudah terkunjungi atau tercek
        visited[i][j] = true;

        // Menuju jalur bawah atau pindah satu langkah ke bawah dari lokasi sekarang
        if (isSafe(mat, visited, i + 1, j)) {
            // Apabila tujuan bawah aman (Hasil true dari fungsi isSafe)
            min_dist = findShortestPath(mat, i + 1, j, x, y, min_dist, dist + 1);
        }

        // Menuju jalur kanan atau pindah satu langkah ke kanan dari lokasi sekarang
        if (isSafe(mat, visited, i, j + 1)) {
            // Apabila tujuan kanan aman (Hasil true dari fungsi isSafe)
            min_dist = findShortestPath(mat, i, j + 1, x, y, min_dist, dist + 1);
        }

        // Menuju jalur atas atau pindah satu langkah ke atas dari lokasi sekarang
        if (isSafe(mat, visited, i - 1, j)) {
            // Apabila tujuan atas aman (Hasil true dari fungsi isSafe)
            min_dist = findShortestPath(mat, i - 1, j, x, y, min_dist, dist + 1);
        }

        // Menuju jalur kiri atau pindah satu langkah ke kiri dari lokasi sekarang
        if (isSafe(mat, visited, i, j - 1)) {
            // Apabila tujuan kiri aman (Hasil true dari fungsi isSafe)
            min_dist = findShortestPath(mat, i, j - 1, x, y, min_dist, dist + 1);
        }

        // Menghapus jejak true dari titik sekarang
        visited[i][j] = false;
        return min_dist;
    }

    // Fungsi untuk mencari rute tercepat atau terpendek
    // Berisi kode untuk mengecek denah, lokasi awal, tujuan
    // Disini dibuat juga denah yang berisi titik kondisi pengecekan denah (true/false)
    static int findShortestPathLength(int[][] mat, int[] src, int[] dest) {
        if (mat.length == 0 || mat[src[0]][src[1]] == 0 || mat[dest[0]][dest[1]] == 0)  {
            // Apabila denah nya kosong
            // Atau apabila denahnya ada tapi lokasi awal pada titik 0 (Tidak bisa dilalui/Bukan rute)
            // Atau apabila denahnya ada tapi lokasi tujuan pada titik 0 (Tidak bisa dilalui/Bukan rute)
            return -1;
        }

        int row = mat.length; // Jumlah Baris
        int col = mat[0].length; // Jumlah Kolom

        // Membuat denah array yang berisi titik mana yang sudah dikunjungi
        // Atau titik yang sudah di cek
        // Ukurannnya sama dengan denah asli
        // Berisi nilai true dan false
        visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            // Membuat baris nya
            for (int j = 0; j < col; j++) {
                // Membuat kolom nya
                visited[i][j] = false; // Nilai default false atau belum dikunjungi atau dicek
            }
        }

        // Memasukkan nilai max dari variabel int
        // Nilai max int = 2147483647
        int dist = Integer.MAX_VALUE;

        // Pengecekan rute
        dist = findShortestPath(mat, src[0], src[1], dest[0], dest[1], dist, 0);

        // Mengecek apakah jumlah rute nya melebihi batas yang bisa disimpan variabel int
        if (dist != Integer.MAX_VALUE) {
            // Kalau tidak melebihi batas max int
            return dist;
        }

        return -1;
    }

    // Fungsi Main
    public static void main(String[] args) {
        // Maps Denah
        // Berupa Array 2 Dimensi
        // Dengan ukuran 9 (Baris) x 10 (Kolom)
        // 1 Bisa dilalui
        // 0 Tidak bisa dilalui
        int[][] mat = new int[][] {
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
        };

        // Lokasi Awal
        int[] src = { 0, 0 };

        // Tujuan
        int[] dest = { 3, 4 };

        // Menemukan rute tercepat atau terpendek
        int dist = findShortestPathLength(mat, src, dest);

        if (dist != -1) {
            // Rute tercepat atau terpendek ditemukan
            System.out.print("Shortest Path is " + dist);
        } else {
            // Apabila tidak ditemukan rute nya
            System.out.print("Shortest Path doesn't exist");
        }
    }
}

// This code is contributed by phasing17
// https://www.geeksforgeeks.org/shortest-path-in-a-binary-maze
