public class DataDosen22 {

    public void dataSemuaDosen(Dosen22[] arrayOfDosen) {
        int no = 1;
        for(Dosen22 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            dosen.cetakInfo();
            no++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for(Dosen22 dosen : arrayOfDosen) {
            if(dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        for(Dosen22 dosen : arrayOfDosen) {
            if(dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jumlahPria++;
            } else {
                totalWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        double rataPria   = jumlahPria   > 0 ? (double) totalPria / jumlahPria : 0;
        double rataWanita = jumlahWanita > 0 ? (double) totalWanita / jumlahWanita : 0;
        System.out.println("Rata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
        System.out.println("------------------------------");
    }

    public void infoDosenPalingTua(Dosen22[] arrayOfDosen) {
        Dosen22 palingTua = arrayOfDosen[0];
        for(Dosen22 dosen : arrayOfDosen) {
            if(dosen.usia > palingTua.usia) {
                palingTua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        palingTua.cetakInfo();
    }

    public void infoDosenPalingMuda(Dosen22[] arrayOfDosen) {
        Dosen22 palingMuda = arrayOfDosen[0];
        for(Dosen22 dosen : arrayOfDosen) {
            if(dosen.usia < palingMuda.usia) {
                palingMuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        palingMuda.cetakInfo();
    }
}
