import java.util.Scanner;

public class Main {

    static Mahasiswa[] dataMahasiswa = {
        new Mahasiswa("22001", "Andi",  "Teknik Informatika"),
        new Mahasiswa("22002", "Budi",  "Teknik Informatika"),
        new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
    };

    static Buku[] dataBuku = {
        new Buku("B001", "Algoritma",   2020),
        new Buku("B002", "Basis Data",  2019),
        new Buku("B003", "Pemrograman", 2021),
        new Buku("B004", "Fisika",      2024)
    };

    static Peminjaman[] pinjam = {
        new Peminjaman(dataMahasiswa[0], dataBuku[0],  7),  // Andi  - Algoritma
        new Peminjaman(dataMahasiswa[1], dataBuku[1],  3),  // Budi  - Basis Data
        new Peminjaman(dataMahasiswa[2], dataBuku[2], 10),  // Citra - Pemrograman
        new Peminjaman(dataMahasiswa[2], dataBuku[3],  6),  // Citra - Fisika
        new Peminjaman(dataMahasiswa[0], dataBuku[1],  4)   // Andi  - Basis Data
    };

    static void tampilMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i].tampilMahasiswa();
        }
    }

    static void tampilBuku() {
        System.out.println("\nDaftar Buku:");
        for (int i = 0; i < dataBuku.length; i++) {
            dataBuku[i].tampilBuku();
        }
    }

    static void tampilPeminjaman() {
        System.out.println("\nData Peminjaman:");
        for (int i = 0; i < pinjam.length; i++) {
            pinjam[i].tampilPeminjaman();
        }
    }

    static void urutkanDenda() {
        // Salin array agar data asli tidak berubah
        Peminjaman[] sorted = new Peminjaman[pinjam.length];
        for (int i = 0; i < pinjam.length; i++) {
            sorted[i] = pinjam[i];
        }

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j].denda < sorted[j + 1].denda) {
                    Peminjaman temp = sorted[j];
                    sorted[j]     = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSetelah diurutkan (Denda terbesar):");
        for (int i = 0; i < sorted.length; i++) {
            sorted[i].tampilPeminjaman();
        }
    }

    static void cariBerdasarkanNIM(Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String cari = sc.nextLine();

        boolean ketemu = false;
        for (int i = 0; i < pinjam.length; i++) {
            if (pinjam[i].mhs.nim.equals(cari)) {
                if (!ketemu) {
                    System.out.println("Hasil pencarian NIM " + cari + ":");
                }
                pinjam[i].tampilPeminjaman();
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Data dengan NIM " + cari + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(sc.nextLine());

            if (pilih == 1) {
                tampilMahasiswa();
            } else if (pilih == 2) {
                tampilBuku();
            } else if (pilih == 3) {
                tampilPeminjaman();
            } else if (pilih == 4) {
                urutkanDenda();
            } else if (pilih == 5) {
                cariBerdasarkanNIM(sc);
            } else if (pilih == 0) {
                System.out.println("Terima kasih. Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}