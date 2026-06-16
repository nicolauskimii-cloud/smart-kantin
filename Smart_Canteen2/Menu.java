
package Smart_Canteen2;

public abstract class Menu {
    
    //Atribut sersifat protected
    protected String nama;
    protected double harga;
    
    //constructor menu dengan parameter nama dan harga
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga =  harga;
    }
    
    //getter
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    
    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public abstract String getJenis();
}
