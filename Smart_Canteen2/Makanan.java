
package Smart_Canteen2;

public class Makanan extends Menu implements hitungHarga {
    
    //constructor
    public Makanan(String nama, double harga) {
        super(nama, harga);
    }
    
    //method getJenis bertipe String
    @Override
    public String getJenis() {
        return "Makanan"; //mengembalikan "Makanan"
    }
    
    //method hitungHarga bertipe double dengan parameter jumlah
    @Override
    public double hitungHarga(int jumlah) {
        return harga * jumlah; //mengembalikan nilai harga * jumlah
    }
}
