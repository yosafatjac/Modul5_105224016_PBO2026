public class RekeningBank {
    // No 1 kita membuat atribut private untuk nomor rekening, nama pemilik, dan saldo.
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    //Untuk nomor rekening, kita buat atribut private dan hanya menyediakan getter (tanpa setter).
    public RekeningBank(String nomorRekening, String namaPemilik, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        
        // Untuk ini kita membuat konstruktor agar saldo tidak negatif
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0.0; 
            System.out.println("Peringatan: Saldo awal tidak boleh negatif. Diset ke 0.");
        }
    }

    //Nomor rekening hanya diakses melalui getter, tanpa setter, untuk menjaga keunikan dan integritas data.
    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNamaPemilik(String namaPemilik) {
        if (namaPemilik != null && !namaPemilik.isEmpty()) {
            this.namaPemilik = namaPemilik;
        } else {
            System.out.println("Error: Nama pemilik tidak boleh kosong.");
        }
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    //No 2 Kita membuat jalur untuk mengisi saldo agar tidak bisa diubah langsung.
    public double getSaldo() {
        return saldo;
    }

    //No 3 Kita membuat logika untuk memastikan saldo tidak bisa negatif.
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: Gagal mengubah saldo. Saldo tidak boleh negatif!");
        }
    }

    //No 4 Kita membuat metode untuk menampilkan data rekening.
    public void tampilkanData() {
        System.out.println("--- Data Rekening ---");
        System.out.println("No. Rekening : " + this.nomorRekening);
        System.out.println("Nama Pemilik : " + this.namaPemilik);
        System.out.println("Saldo        : Rp " + this.saldo);
        System.out.println("---------------------------");
    }
}