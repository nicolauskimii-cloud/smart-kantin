
package Smart_Canteen2;

//interface pembayaran
public interface Pembayaran {
    
    /*method bayar bertipe double dengan parameter
    variabel total
    */
    double bayar(double total);
    
    String getMetode();
}
