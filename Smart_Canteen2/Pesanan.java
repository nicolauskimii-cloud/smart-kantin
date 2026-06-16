package Smart_Canteen2;

import java.util.ArrayList;

public class Pesanan {
    
    private ArrayList<DetailPesanan> daftarPesanan;
    private Pembayaran pembayaran;
    
    public Pesanan(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
        daftarPesanan = new ArrayList<>();
    }
    
    public void tambahPesanan(DetailPesanan detail) {
        daftarPesanan.add(detail); //atribut memanggil
    }
    
    public double hitungSubTotal() {
        double total = 0; 
        
        for (DetailPesanan d : daftarPesanan) {
            total += d.getSubtotal();
        }
        return total; 
    }
    
    public double getTotalBayar() {
        return pembayaran.bayar(hitungSubTotal());
    }

    public void tampilStruk() {
        System.out.println("\n>>> STRUK PEMESANAN <<<");
        for (DetailPesanan d : daftarPesanan) {
            System.out.println(d.getMenu().getNama() + " x " + d.getJumlah() + " = Rp" + d.getSubtotal());
        }
        System.out.println("\nSubtotal      : Rp"+hitungSubTotal());

        System.out.println("Pembayaran    : "+ pembayaran.getMetode());

        System.out.println("Total Bayar   : Rp"+ getTotalBayar());
    }
}
