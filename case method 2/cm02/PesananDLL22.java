public class PesananDLL22 {
    NodePesanan22 head;
    NodePesanan22 tail;

    public PesananDLL22() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(int kode, String nama, int harga, String namaPembeli) {
        Pesanan22 p = new Pesanan22(kode, nama, harga, namaPembeli);
        NodePesanan22 node = new NodePesanan22(p);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    private void sortByNama() {
        if (isEmpty()) return;
        boolean swap;
        do {
            swap = false;
            NodePesanan22 tmp = head;
            while (tmp.next != null) {
                if (tmp.data.namaPesanan.compareToIgnoreCase(tmp.next.data.namaPesanan) > 0) {
                    Pesanan22 temp = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = temp;
                    swap = true;
                }
                tmp = tmp.next;
            }
        } while (swap);
    }

    public void laporan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }
        sortByNama();
        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("========================================");
        System.out.println("Kode Pesanan\tNama Pesanan\tHarga");
        NodePesanan22 tmp = head;
        int total = 0;
        while (tmp != null) {
            System.out.println(tmp.data.kodePesanan + "\t\t" + tmp.data.namaPesanan + "\t\t" + tmp.data.harga);
            total += tmp.data.harga;
            tmp = tmp.next;
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Pendapatan: Rp " + total);
    }
}