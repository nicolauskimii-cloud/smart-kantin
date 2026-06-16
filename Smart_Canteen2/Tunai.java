
package Smart_Canteen2;

public class Tunai implements Pembayaran {
    @Override
    public double bayar(double total) {
        return total;
    }
    @Override
    public String getMetode() {
        return "Tunai";
    }
}
