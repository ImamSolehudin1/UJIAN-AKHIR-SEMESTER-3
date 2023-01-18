
package projek.uas;


public class Debit extends Pembayaran {
    private String NomorKartu;


    public void prosesBayar() {
        System.out.println("Proses Pembayaran");
    }

    public String getNomorKartu() {
        return NomorKartu;
    }

    public void setNomorKartu(String NomorKartu) {
        this.NomorKartu = NomorKartu;
    }


}