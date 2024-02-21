public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga;

    Buku15 () {

    }

    public Buku15(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual (int jml) {
        if (stok < jml) System.out.println("Stok tidak cukup");
        else stok -= jml;
    }

    void restok (int jml) {
        stok += jml;
    }

    void gantiHarga (int hrg) {
        harga = hrg;
    }
}
