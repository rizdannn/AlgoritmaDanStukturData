import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("=====INPUT MAHASISWA KE-" + (i+1) + "=====");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa22 m = new Mahasiswa22(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        sc.close();

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
        
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

    }
}