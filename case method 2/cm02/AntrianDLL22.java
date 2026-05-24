public class AntrianDLL22 {
    NodeAntrian22 head;
    NodeAntrian22 tail;
    int size;
    int nomorUrut;

    public AntrianDLL22() {
        head = null;
        tail = null;
        size = 0;
        nomorUrut = 1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(String nama, String noHp) {
        Pembeli22 p = new Pembeli22(nomorUrut, nama, noHp);
        NodeAntrian22 node = new NodeAntrian22(p);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorUrut);
        nomorUrut++;
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("================================");
        System.out.println("No Antrian\tNama\t\tNo HP");
        NodeAntrian22 tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data.noAntrian + "\t\t" + tmp.data.namaPembeli + "\t\t" + tmp.data.noHp);
            tmp = tmp.next;
        }
    }

    public Pembeli22 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Pembeli22 p = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return p;
    }

    public int getSize() {
        return size;
    }
}