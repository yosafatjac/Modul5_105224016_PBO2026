public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstrasi Encapsulation\n");

        RekeningBank rekening1 = new RekeningBank("7832387802", "Yosafat Jacobus", 1000000);

        System.out.println("Data Awal");
        System.out.println("No. Rek   : " + rekening1.getNomorRekening());
        System.out.println("Nama      : " + rekening1.getNamaPemilik());
        System.out.println("Saldo Awal: Rp " + rekening1.getSaldo());
        System.out.println("----------------------------------");

        System.out.println("Menyetor Rp 1.000.000");
        rekening1.setSaldo(rekening1.getSaldo() + 1000000);
        System.out.println("Saldo Sekarang: Rp " + rekening1.getSaldo());

        double tarik = 500000;
        if (rekening1.getSaldo() >= tarik) {
            rekening1.setSaldo(rekening1.getSaldo() - tarik);
            System.out.println("Penarikan berhasil. Sisa saldo: Rp " + rekening1.getSaldo());
        } else {
            System.out.println("Penarikan gagal. Saldo tidak cukup.");
        }

        System.out.println("\nMenguji Penjaga Keamanan Enkapsulasi");
        System.out.println("Mencoba set saldo menjadi -50000...");
        rekening1.setSaldo(-50000); 
    }
       
}