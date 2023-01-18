
package projek.uas;

public class Main {
    
    public static void main(String[] args) {

        
        Customer imam = new Customer();
        imam.setNama("Imam Solehudin");
        imam.setAlamat("Perum BCA Blok. E5 No. 30");
        System.out.println("Pesanan : " + imam.getNama() );
        System.out.println("Alamat Pesanan : " + imam.getAlamat());

        System.out.println("=====================================================");

        Order jnt = new Order();
        imam.addOrder(jnt);

        jnt.setMakanan("Nasi Goreng");
        jnt.setMinuman("Es Teh Manis");
        jnt.setjumlah("1 Paket");
        System.out.println("Pesanan : " + jnt.getMakanan()+"+" + jnt.getMinuman());
        jnt.Jumlah();
        jnt.Total();
        System.out.println("Total pesanan : " + jnt.getjumlah());

        System.out.println("=====================================================");

        Cash cash = new Cash();
        cash.setCash((float) 20000.0);
        jnt.addCashList(cash);
        System.out.println("Total Pembayaran  : Rp" + (int) cash.getCash());

        System.out.println("=====================================================");

        Debit debit = new Debit();
        debit.prosesBayar();
        debit.setNomorKartu("4567891230123658");
        jnt.addDebitList(debit);
        System.out.println("Nomor kartu debit : " + debit.getNomorKartu() );

        System.out.println("Terima kasih telah berbelanja");
    }
}