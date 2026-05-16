public class QueueLinkedList22 {
    NodeQueue22 head;
    NodeQueue22 tail;
    int size;
    int max;

    public QueueLinkedList22(int max) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.max = max;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(MahasiswaQ22 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        NodeQueue22 node = new NodeQueue22(mhs);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.print("Memanggil: ");
        head.data.tampilInformasi();
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Antrian terdepan: ");
            head.data.tampilInformasi();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Antrian paling akhir: ");
            tail.data.tampilInformasi();
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Antrian:");
        NodeQueue22 tmp = head;
        int no = 1;
        while (tmp != null) {
            System.out.print(no + ". ");
            tmp.data.tampilInformasi();
            tmp = tmp.next;
            no++;
        }
    }

    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong!");
        } else {
            head = null;
            tail = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }

    public int jumlahAntrian() {
        return size;
    }
}