import java.util.Scanner;
public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen22[] arrayOfDosen = new Dosen22[3];
        String kode, nama;
        Boolean jenisKelamin;
        int usia;

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true=Pria/false=Wanita) : ");
            jenisKelamin = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Usia          : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen22(kode, nama, jenisKelamin, usia);
        }

        DataDosen22 dataDosen = new DataDosen22();

        System.out.println("===== DATA SEMUA DOSEN =====");
        dataDosen.dataSemuaDosen(arrayOfDosen);

        System.out.println("===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("===== RERATA USIA PER JENIS KELAMIN =====");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("===== DOSEN PALING TUA =====");
        dataDosen.infoDosenPalingTua(arrayOfDosen);

        System.out.println("===== DOSEN PALING MUDA =====");
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
