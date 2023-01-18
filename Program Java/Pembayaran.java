
package projek.uas;


public abstract class Pembayaran {
    private float jumlahBayar;
    private final Order order;

    public Pembayaran() {
        order = new Order();
    }
}