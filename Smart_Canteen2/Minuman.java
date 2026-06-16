
package Smart_Canteen2;

public class Minuman extends Menu implements hitungHarga {

    //constructor    
    public Minuman(String nama, double harga) {
        super(nama, harga);
    }
    
    //method getJenis bertipe String
    @Override
    public String getJenis() {
        return "Minuman";
    }
    
    //method hitungHarga bertipe double dengan parameter jumlah
    @Override
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}
