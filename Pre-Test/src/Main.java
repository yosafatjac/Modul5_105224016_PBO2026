public class Main {
    public static void main(String[] args) {

        RekeningBank akunSaya = new RekeningBank();

        akunSaya.setSaldo(150000);
        System.out.println("Saldo saat ini: Rp " + akunSaya.getSaldo());

    
        System.out.println("\nMencoba set saldo -50000...");
        akunSaya.setSaldo(-50000); 
        
        System.out.println("Saldo akhir: Rp " + akunSaya.getSaldo());
    }
}
