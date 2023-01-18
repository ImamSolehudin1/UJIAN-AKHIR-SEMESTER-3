package projek.uas;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String Makanan;
    private String Minuman;
    private String jumlah;
    private Customer customer;
    private List<Cash> cashList;
    private List<Debit> debitList;
    private List<OrderDetail> orderDetailList;

    public Order() {
        this.cashList = new ArrayList<Cash>();
        this.debitList = new ArrayList<Debit>();
        this.orderDetailList = new ArrayList<OrderDetail>();
        this.customer = new Customer();
    }

    public String getMakanan() {
        return Makanan;    }
    public void setMakanan(String Makanan) {
        this.Makanan = Makanan;    }
    
    public String getMinuman() {
        return Minuman;    }
    public void setMinuman(String Minuman) {
        this.Minuman = Minuman;    }
    
    public String getjumlah() {
        return jumlah;    }
    public void setjumlah(String jumlah) {
        this.jumlah = jumlah;    }    
    
    public void addCashList(Cash cash) {
        this.cashList.add(cash);    }
    public void addDebitList(Debit debit) {
        this.debitList.add(debit);    }
    public void addOrderDetail(OrderDetail orderDetail) {
        this.orderDetailList.add(orderDetail);    }
    public void Jumlah() {
        System.out.println("Menghitung Jumlah...");
    }
    public void Total() {
        System.out.println("Menghitung Total...");
    }
}
