
package customer;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Customer {


    public static void main(String[] args) {
        
        //============== Container =============
        JFrame custom = new JFrame("CUSTOMER");
        //ukuran form
        custom.setSize(600, 800);
        // mengatur tombol close
        custom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // agar form ditengah
        custom.setLocationRelativeTo(null);
        // mengatur layout
        custom.setLayout(null);
       
        // ======= Bagian Componen ============
        
        JLabel labelcustom = new JLabel("CUSTOMER");
        labelcustom.setBounds(180, 30, 100, 30);
        custom.add(labelcustom);
        
        JLabel labelNama = new JLabel("Nama      ");
        labelNama.setBounds(20, 80, 150, 25);
        custom.add(labelNama);
        
        JTextField txtNama = new JTextField();
        txtNama.setBounds(150, 80, 150, 25);
        custom.add(txtNama);

        JLabel labelAlamat = new JLabel("Alamat      ");
        labelAlamat.setBounds(20, 110, 150, 25);
        custom.add(labelAlamat);
        
        JTextField txtAlamat = new JTextField();
        txtAlamat.setBounds(150, 110, 150, 25);
        custom.add(txtAlamat);
        
        
        JLabel labelOrder = new JLabel("ORDER");
        labelOrder.setBounds(180, 140, 150, 50);
        custom.add(labelOrder);
        
        JLabel labelPesanan = new JLabel("Pilih Pesanan");
        labelPesanan.setBounds(40, 190, 150, 25);
        custom.add(labelPesanan);
        
        JLabel labelMakanan = new JLabel("Makanan");
        labelMakanan.setBounds(40, 220, 150, 25);
        custom.add(labelMakanan);
        
        String Makan[] = {"Nasi Goreng","Mie Goreng","Ayam Goreng", "Ikan Goreng"};
        JComboBox cbMakan = new JComboBox(Makan);
        cbMakan.setBounds(150, 220, 100, 30);
        custom.add(cbMakan);
        
        JLabel labelJPesan1 = new JLabel("Jumlah Pesanan");
        labelJPesan1.setBounds(280, 190, 150, 25);
        custom.add(labelJPesan1);
        
        String Jumlah1[] = {"1","2","3", "4", "5"};
        JComboBox cbJumlah1 = new JComboBox(Jumlah1);
        cbJumlah1.setBounds(280, 220, 50, 30);
        custom.add(cbJumlah1);
        
        
        JLabel labelMinuman = new JLabel("Minuman");
        labelMinuman.setBounds(40, 270, 150, 25);
        custom.add(labelMinuman);
        
        String Minum[] = {"Es Teh Manis","Es Jeruk","Cappucionno", "Air Putih"};
        JComboBox cbMinum = new JComboBox(Minum);
        cbMinum.setBounds(150, 270, 100, 30);
        custom.add(cbMinum);
        
        String Jumlah2[] = {"1","2","3", "4", "5"};
        JComboBox cbJumlah2 = new JComboBox(Jumlah2);
        cbJumlah2.setBounds(280, 270, 50, 30);
        custom.add(cbJumlah2);
        
        JLabel labelOrderDetail = new JLabel("ORDER DETAIL");
        labelOrderDetail.setBounds(180, 320, 150, 50);
        custom.add(labelOrderDetail);        
        
         JLabel labelHargaMakan = new JLabel("Harga Makanan");
        labelHargaMakan.setBounds(20, 390, 150, 25);
        custom.add(labelHargaMakan);
        
        JTextField txtHargaMakan = new JTextField();
        txtHargaMakan.setBounds(150, 390, 150, 25);
        custom.add(txtHargaMakan);
        
         JLabel labelHargaMinum = new JLabel("Harga Minum");
        labelHargaMinum.setBounds(20, 420, 150, 25);
        custom.add(labelHargaMinum);
        
        JTextField txtHargaMinum = new JTextField();
        txtHargaMinum.setBounds(150, 420, 150, 25);
        custom.add(txtHargaMinum);
        
        JTextField txtJum1 = new JTextField();
        txtJum1.setBounds(320, 390, 40, 25);
        custom.add(txtJum1);
        
        JLabel Jum1 = new JLabel("x");
        Jum1.setBounds(310, 390, 40, 25);
        custom.add(Jum1);

        JTextField txtJum2 = new JTextField();
        txtJum2.setBounds(320, 420, 40, 25);
        custom.add(txtJum2);
        
        JLabel Jum2 = new JLabel("x");
        Jum2.setBounds(310, 420, 40, 25);
        custom.add(Jum2);
        
        JLabel labelJPesan2 = new JLabel("Jml");
        labelJPesan2.setBounds(325, 350, 150, 50);
        custom.add(labelJPesan2);
        
        
        JLabel labelTotalBayar = new JLabel("Total Bayar");
        labelTotalBayar.setBounds(20, 450, 150, 25);
        custom.add(labelTotalBayar);
        
        JTextField txtTotalBayar = new JTextField();
        txtTotalBayar.setBounds(150, 450, 150, 25);
        custom.add(txtTotalBayar);
        
        JLabel labelPembayaran = new JLabel("Pembayaran");
        labelPembayaran.setBounds(180, 480, 150, 50);
        custom.add(labelPembayaran);

        JRadioButton radioCash = new JRadioButton();
        radioCash.setText("Cash");
        radioCash.setBounds(130, 530, 80, 50);      
        JRadioButton radioDebit = new JRadioButton();
        radioDebit.setText("Debit");
        radioDebit.setBounds(250, 530, 80, 50);
        custom.add(radioCash);
        custom.add(radioDebit);
        
        ButtonGroup grouppay = new ButtonGroup();
        grouppay.add(radioCash);
        grouppay.add(radioDebit);
        
        JLabel labelDebit = new JLabel("Masukan Nomor Kartu");
        labelDebit.setBounds(20, 590, 150, 25);
        custom.add(labelDebit);
        
        JTextField txtDebit = new JTextField();
        txtDebit.setBounds(150, 590, 150, 25);
        custom.add(txtDebit);
        // menampilkan form
       
        
        custom.setVisible(true);
        
        
        JButton Submit = new JButton("SUBMIT");
        Submit.setBounds(160, 650, 80, 25);
        custom.add(Submit);
        
        JButton Reset = new JButton("RESET");
        Reset.setBounds(260, 650, 80, 25);
        custom.add(Reset);
        
    }

    
}
