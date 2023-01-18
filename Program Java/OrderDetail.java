
package projek.uas;


public class OrderDetail {
    private int HargaMakanan;
    private int HargaMinuman;
    private final Order order;


    public OrderDetail(Order order) {
        this.order = order;

    }

    public int getHargaMakanan() {
        return HargaMakanan;
    }

    public void setHargaMakanan(int HargaMakanan) {
        this.HargaMakanan = HargaMakanan;
    }


    public int getHArgaMinuman(){
        return HargaMinuman;
    }

    public void setHargaMinuman(int HargaMinuman) {
    this.HargaMinuman = HargaMinuman;
    }


    public void JumlahHargaMakanan() {
    System.out.println("Menghitung Jumlah Harga Makanan...");
    }

    public void JumlahHargaMinuman() {
    System.out.println("Menghitung Jumlah Harga Minuman...");
    }


}