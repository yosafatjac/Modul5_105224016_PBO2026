public class Main {
    public static void main(String[] args) {
       
        System.out.println("\n=== SIMULASI SISTEM HOTEL ===\n");
        System.out.println("--- Pembuatan Kamar 1 ---");
        KamarHotel kamar1 = new KamarHotel("101", "Reguler", 2);
       
        kamar1.setTipeKamar("Presidential"); 
        kamar1.setHargaPerMalam(-10000); 
        System.out.println();
        
        System.out.println("--- Pembuatan Kamar 2 ---");
        KamarHotel kamar2 = new KamarHotel("205", "Suite", 2, 750000);
       
        System.out.println("Mencoba memesan overcapacity:");
        kamar2.pesanKamar(4);

        System.out.println("\nMencoba memesan sesuai kapasitas:");
        kamar2.pesanKamar(2);

        System.out.println("\nMencoba memesan kamar yang sudah terisi:");
        kamar2.pesanKamar(); 
        System.out.println();
        
        System.out.println("--- Perhitungan Tagihan ---");
        System.out.println("Tagihan Kamar 1 (2 Malam, PROMO):");
        double tagihanKamar1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Bayar Kamar 1: Rp " + tagihanKamar1 + "\n");
       
        System.out.println("Tagihan Kamar 2 (4 Malam, PROMO):");
        double tagihanKamar2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Bayar Kamar 2: Rp " + tagihanKamar2 + "\n");
        
        System.out.println("=== STRUK INFORMASI AKHIR ===");
        kamar1.cetakProfil();
        kamar2.cetakProfil();
    }
}