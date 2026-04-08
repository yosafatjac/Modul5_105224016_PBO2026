public class Main {
    public static void main(String[] args) {
       
        Barang barang = new Barang("52417", "Macbook Air M4");

        barang.kategori = "Elektronik";

        System.out.println("=== DEMO ENKAPSULASI DAN VALIDASI ===");

        System.out.println("1. Mencoba ubah stok langsung (barang.stok = 50) → GAGAL (private)");

        barang.setHargaSatuan(15000000);

        barang.setHargaSatuan(-500000);
        System.out.println("2. Mencoba set harga minus (-500000) : Tidak Berubah (harga <= 0)");

        barang.tambahStok(50);
        System.out.println("3. tambahStok(50) : Stok sekarang: " + barang.getStok());

        barang.tambahStok(-10);
        System.out.println("4. tambahStok(-10) : TIDAK BERUBAH");

        barang.kurangiStok(20);
        System.out.println("5. kurangiStok(20) : Stok sekarang: " + barang.getStok());

        barang.kurangiStok(100);
        System.out.println("6. kurangiStok(100) : Tidak Berubah (stok tidak cukup)");

        System.out.println("\nHasil Akhir (setelah semua operasi)");
        barang.tampilkanDetailBarang();

        System.out.println("Semua aturan enkapsulasi, validasi stok/harga, dan pencegahan stok negatif sudah diterapkan!");
    }
}