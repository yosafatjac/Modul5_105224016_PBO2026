public class Barang {
    private String idBarang;
    private String namaBarang;
    private int stok;
    private int hargaSatuan;
    protected String kategori;

    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0;
        this.kategori = "";  
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        }
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        if (hargaSatuan > 0) {
            this.hargaSatuan = hargaSatuan;
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && this.stok >= jumlah) {
            this.stok -= jumlah;
        }
    }

    public void tampilkanDetailBarang() {
        System.out.println("=== DETAIL BARANG ===");
        System.out.println("ID Barang     : " + idBarang);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Kategori      : " + kategori);
        System.out.println("Stok          : " + stok + " unit");
        System.out.println("Harga Satuan  : Rp " + hargaSatuan);
        System.out.println("=====================");
    }
}

