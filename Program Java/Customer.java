
package projek.uas;

import java.util.ArrayList;
import java.util.List;


public class Customer {

    private String nama;
    private String alamat;
    private final List<Order> orderList = new ArrayList<Order>();



    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
    return nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

}
