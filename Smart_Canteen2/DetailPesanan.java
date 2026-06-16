
package Smart_Canteen2;

public class DetailPesanan {
    private Menu menu;
    private int jumlah;
    
    public DetailPesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }
    public Menu getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getSubtotal() {
        hitungHarga h = (hitungHarga) menu;
        return h.hitungHarga(jumlah);
    }
}
