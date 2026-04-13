
public class MahasiswaBerprestasi22 {
    Mahasiswa22[] ListMhs = new Mahasiswa22[5];
    int Idx;

    void tambah(Mahasiswa22 M) {
        if (Idx < ListMhs.length) {
            ListMhs[Idx] = M;
            Idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (Mahasiswa22 M : ListMhs) {
            M.TampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < ListMhs.length - 1; i++) {
            for (int j = 1; j < ListMhs.length - i; j++) {
                if (ListMhs[j].IPK > ListMhs[j - 1].IPK) {
                    Mahasiswa22 tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j - 1];
                    ListMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < ListMhs.length - 1; i++) {
            int IdxMin = i;
            for (int j = i + 1; j < ListMhs.length; j++) {
                if (ListMhs[j].IPK < ListMhs[IdxMin].IPK) {
                    IdxMin = j;
                }
            }
            Mahasiswa22 Tpm = ListMhs[IdxMin];
            ListMhs[IdxMin] = ListMhs[i];
            ListMhs[i] = Tpm;
        }
    }

    void insertionSort() {
        for (int i = 1; i > ListMhs.length; i++) {
            Mahasiswa22 Temp = ListMhs[i];
            int j = i;
            while (j > 0 && ListMhs[j - 1].IPK > Temp.IPK) {
                ListMhs[j] = ListMhs[j - 1];
                j--;
            }
            ListMhs[j] = Temp;
        }
    }

}
