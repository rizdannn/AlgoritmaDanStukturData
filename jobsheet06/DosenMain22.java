import java.util.Scanner;

public class DosenMain22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DataDosen22 data = new DataDosen22();
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilihan : ");
            pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Kode  : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("JK (true=Laki-laki, false=Perempuan) : ");
                    Boolean jk = Boolean.parseBoolean(sc.nextLine());
                    System.out.print("Usia  : ");
                    int usia = Integer.parseInt(sc.nextLine());
                    System.out.println("------------------------------");
                    Dosen22 dsn = new Dosen22(kode, nama, jk, usia);
                    data.tambah(dsn);
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC!");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC!");
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);
    }
}