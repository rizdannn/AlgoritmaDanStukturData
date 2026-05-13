import java.util.Scanner;
 
public class MainKRS {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10, 30);
        int pilihan;
 
        do {
            System.out.println("\n=== Menu Antrian KRS - Dosen Pembina Akademik ===");
            System.out.println("1.  Tambah Mahasiswa ke Antrian");
            System.out.println("2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Tampilkan 2 Antrian Terdepan");
            System.out.println("5.  Tampilkan Antrian Paling Akhir");
            System.out.println("6.  Cek Antrian Kosong");
            System.out.println("7.  Cek Antrian Penuh");
            System.out.println("8.  Kosongkan Antrian");
            System.out.println("9.  Jumlah Antrian Saat Ini");
            System.out.println("10. Jumlah Mahasiswa Sudah Proses KRS");
            System.out.println("11. Jumlah Mahasiswa Belum Proses KRS");
            System.out.println("0.  Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
 
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilkanAkhir();
                    break;
                case 6:
                    System.out.println("Antrian kosong: " + antrian.isEmpty());
                    break;
                case 7:
                    System.out.println("Antrian penuh: " + antrian.isFull());
                    break;
                case 8:
                    antrian.kosongkanAntrian();
                    break;
                case 9:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa sudah proses KRS: " + antrian.getTotalDilayani());
                    break;
                case 11:
                    System.out.println("Jumlah mahasiswa belum proses KRS: " + antrian.getBelumKRS());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
 
        sc.close();
    }
}
