public class Mahasiswa22 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa22() {}

    public Mahasiswa22(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
