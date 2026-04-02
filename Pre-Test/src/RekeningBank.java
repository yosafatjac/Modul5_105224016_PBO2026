public class RekeningBank {

    private String nomorRekening;
    private double saldo;

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
        } else {
            System.out.println("Gagal: Saldo tidak boleh minus!");
        }
    }
}
