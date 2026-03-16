public class MainNilai {

    public static void main(String[] args) {
        int[] nilaiUTS = {85, 90, 78, 92, 88};
        int[] nilaiUAS = {80, 85, 75, 95, 90};

        int utsTertinggi = Nilai.cariMaksUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        int utsTerendah = Nilai.cariMinUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        double rataUAS = Nilai.hitungRataUAS(nilaiUAS);

        System.out.println("Nilai UTS Tertinggi: " + utsTertinggi);
        System.out.println("Nilai UTS Terendah: " + utsTerendah);
        System.out.println("Rata-rata Nilai UAS: " + rataUAS);
    }
}
