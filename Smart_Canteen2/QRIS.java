
package Smart_Canteen2;

//kelas QRIS yang mengimplemen Pembayaran
public class QRIS implements Pembayaran {
    
    //method bayar dengan parameter total
    @Override
    public double bayar(double total) {
        
        //mengembalikan nilai total + 500
        return total + 500;
    }
    
    //method getter 
    @Override
    public String getMetode() {
        return "QRIS"; //mengembalikan "QRIS"
    }
}
