class Nilai {

    public static int cariMaksUTS(int[] nilai, int kiri, int kanan) {
        if (kiri == kanan) {
            return nilai[kiri];
        }

        int tengah = (kiri + kanan) / 2;

        int maksKiri = cariMaksUTS(nilai, kiri, tengah);
        int maksKanan = cariMaksUTS(nilai, tengah + 1, kanan);

        return Math.max(maksKiri, maksKanan);
    }

    public static int cariMinUTS(int[] nilai, int kiri, int kanan) {
        if (kiri == kanan) {
            return nilai[kiri];
        }

        int tengah = (kiri + kanan) / 2;

        int minKiri = cariMinUTS(nilai, kiri, tengah);
        int minKanan = cariMinUTS(nilai, tengah + 1, kanan);

        return Math.min(minKiri, minKanan);
    }

    public static double hitungRataUAS(int[] nilai) {
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        return (double) total / nilai.length;
    }
}