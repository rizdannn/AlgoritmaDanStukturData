import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianDLL22 antrian = new AntrianDLL22();
        PesananDLL22 pesanan = new PesananDLL22();
        int pilihan;

        do {
            System.out.println("==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();
                    antrian.tambahAntrian(nama, noHp);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    Pembeli22 dilayani = antrian.hapusAntrian();
                    if (dilayani != null) {
                        System.out.println("Melayani: " + dilayani.namaPembeli);
                        System.out.print("Kode Pesanan  : ");
                        int kode = sc.nextInt(); sc.nextLine();
                        System.out.print("Nama Pesanan  : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga         : ");
                        int harga = sc.nextInt(); sc.nextLine();
                        pesanan.tambahPesanan(kode, namaPesanan, harga, dilayani.namaPembeli);
                        System.out.println(dilayani.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;

                case 4:
                    pesanan.laporan();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
