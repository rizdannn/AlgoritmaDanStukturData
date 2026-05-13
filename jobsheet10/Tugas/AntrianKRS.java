public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDilayani;    
    int maxDilayaniDPA;   
 
    public AntrianKRS(int max, int maxDilayaniDPA) {
        this.max = max;
        this.maxDilayaniDPA = maxDilayaniDPA;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }
 
    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah mahasiswa.");
            return;
        }
        if (totalDilayani >= maxDilayaniDPA) {
            System.out.println("DPA sudah mencapai batas maksimal mahasiswa yang ditangani (" + maxDilayaniDPA + ").");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
    }
 
    public void panggilKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa untuk diproses.");
            return;
        }
        System.out.println("Memanggil mahasiswa untuk proses KRS:");
        int jumlahDipanggil = 0;
        for (int i = 0; i < 2; i++) {
            if (isEmpty()) break;
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalDilayani++;
            jumlahDipanggil++;
            System.out.print("  " + jumlahDipanggil + ". ");
            mhs.tampilkanData();
        }
        System.out.println("Total sudah proses KRS: " + totalDilayani);
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang dalam antrian:");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
 
    public int getTotalDilayani() {
        return totalDilayani;
    }

    public int getBelumKRS() {
        return size;
    }
}
