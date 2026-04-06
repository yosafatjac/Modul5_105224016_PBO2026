public class KamarHotel {
    // Atribut Kamar
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    //Membuat Konstruktor KamarHotel
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); 
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0; 
        this.isTersedia = true; 
    }

   
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam);
        this.isTersedia = true; 
    }
    //Membuat Getter untuk atribut kamar
    public String getNomorKamar() { return nomorKamar; }
    public String getTipeKamar() { return tipeKamar; }
    public int getKapasitasMaksimal() { return kapasitasMaksimal; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public boolean getIsTersedia() { return isTersedia; }

   
    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public void setKapasitasMaksimal(int kapasitasMaksimal) {
        this.kapasitasMaksimal = kapasitasMaksimal;
    }
    //Membuat Setter untuk atribut kamar dengan validasi
    public void setTipeKamar(String tipeKamar) {
       
        if (tipeKamar.equalsIgnoreCase("Reguler") || 
            tipeKamar.equalsIgnoreCase("Premium") || 
            tipeKamar.equalsIgnoreCase("Suite")) {

            // Jika tipe kamar valid, set tipe kamar    
            if(tipeKamar.equalsIgnoreCase("Reguler")) this.tipeKamar = "Reguler";
            else if(tipeKamar.equalsIgnoreCase("Premium")) this.tipeKamar = "Premium";
            else this.tipeKamar = "Suite";
        } else {
            
            System.out.println("Peringatan: Tipe kamar '" + tipeKamar + "' tidak dikenali. Sistem memaksanya menjadi 'Reguler'.");
            this.tipeKamar = "Reguler";
        }
    }
    
    public void setHargaPerMalam(double harga) {
        //Memvalidasi harga per malam, tidak boleh di bawah 50000
        if (harga < 50000) {
            System.out.println("Peringatan: Harga tidak boleh di bawah 50000. Sistem memaksanya menjadi 50000.");
            this.hargaPerMalam = 50000; 
        } else {
            this.hargaPerMalam = harga;
        }
    }

  
    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Sukses: Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
            System.out.println("Peringatan: Kamar " + nomorKamar + " sudah terisi!");
        }
    }

    // Overloading metode pesanKamar untuk jumlah tamu
    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("Peringatan: Kamar " + nomorKamar + " sudah terisi!");
            return;
        }
        
        if (jumlahTamu > kapasitasMaksimal) {
            
            System.out.println("Teguran: Pemesanan ditolak! Jumlah tamu (" + jumlahTamu + ") melebihi kapasitas maksimal (" + kapasitasMaksimal + ").");
           
        } else {
            isTersedia = false;
            System.out.println("Sukses: Kamar " + nomorKamar + " berhasil dipesan untuk " + jumlahTamu + " orang.");
        }
    }

   
    public void batalPesan() {
        isTersedia = true;
        System.out.println("Pemesanan dibatalkan. Kamar " + nomorKamar + " kini tersedia kembali.");
    }

   
    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    //Membuat Overloading metode hitungTotalBayar untuk menghitung dengan kode voucher
    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = hitungTotalBayar(jumlahMalam);
        
        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            double diskon = total * 0.20; 
            return total - diskon;
        } else {
           
            System.out.println("Penolakan: Voucher tidak valid atau syarat minimum menginap (3 malam) tidak terpenuhi. Tagihan normal berlaku.");
            return total;
        }
    }
    //Membuat method untuk mencetak profil kamar
    public void cetakProfil() {
        System.out.println("---------------------------------");
        System.out.println("Profil Kamar: " + nomorKamar);
        System.out.println("Tipe        : " + tipeKamar);
        System.out.println("Kapasitas   : " + kapasitasMaksimal + " Orang");
        System.out.println("Harga/Malam : Rp " + hargaPerMalam);
        System.out.println("Tersedia    : " + (isTersedia ? "Ya" : "Tidak"));
        System.out.println("---------------------------------");
    }
}