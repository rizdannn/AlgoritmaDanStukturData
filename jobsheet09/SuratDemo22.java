import java.util.Scanner;

public class SuratDemo22 {

    public static void main(String[] args) {

        StackSurat22 stack = new StackSurat22(10);
        Scanner scan     = new Scanner(System.in);
        int pilih;
        int idCounter = 1;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Nama Mahasiswa : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S=Sakit / I=Izin) : ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    String idSurat = "SRT" + String.format("%03d", idCounter++);
                    Surat22 surat = new Surat22(idSurat, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat izin " + nama + " berhasil diterima. ID: " + idSurat);
                    break;

                case 2:
                    Surat22 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("=== Memproses Surat Izin ===");
                        System.out.println("ID Surat   : " + diproses.idSurat);
                        System.out.println("Nama       : " + diproses.namaMahasiswa);
                        System.out.println("Kelas      : " + diproses.kelas);
                        System.out.println("Jenis Izin : " + (diproses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi     : " + diproses.durasi + " hari");
                        System.out.println("Status     : Surat berhasil divalidasi.");
                    }
                    break;

                case 3:
                    Surat22 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("=== Surat Izin Terakhir ===");
                        System.out.println("ID Surat   : " + terakhir.idSurat);
                        System.out.println("Nama       : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas      : " + terakhir.kelas);
                        System.out.println("Jenis Izin : " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi     : " + terakhir.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }

}
