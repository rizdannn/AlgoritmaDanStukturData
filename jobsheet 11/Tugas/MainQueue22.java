import java.util.Scanner;

public class MainQueue22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList22 antrian = new QueueLinkedList22(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampil Semua Antrian");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : "); String nim = sc.nextLine();
                    System.out.print("Nama  : "); String nama = sc.nextLine();
                    System.out.print("Kelas : "); String kelas = sc.nextLine();
                    System.out.print("IPK   : "); double ipk = sc.nextDouble(); sc.nextLine();
                    antrian.tambahAntrian(new MahasiswaQ22(nim, nama, kelas, ipk));
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.lihatAkhir();
                    break;
                case 5:
                    antrian.tampilSemua();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 8:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 9:
                    antrian.kosongkanAntrian();
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
