
package Smart_Canteen2;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartCanteenMain {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        ArrayList<Stand> daftarStand = new ArrayList<>();
        
        Stand kale = new Stand("Stand Kale");
        
        kale.tambahMenu(new Makanan("Batagor", 13000));
        kale.tambahMenu(new Makanan("Mie Ayam", 13000));
        kale.tambahMenu(new Makanan("Bakso", 13000));
        
        kale.tambahMenu(new Minuman("Es Teh", 3000));
        kale.tambahMenu(new Minuman("Es Jeruk", 5000));
        kale.tambahMenu(new Minuman("Jus Alpukat", 10000));
        
        daftarStand.add(kale);
        
        Stand twd = new Stand("Stand TWD");
        
        twd.tambahMenu(new Makanan("Ayam Geprek", 15000));
        twd.tambahMenu(new Makanan("Sop Ayam", 15000));
        twd.tambahMenu(new Makanan("Ayam Bakar", 15000));
        
        twd.tambahMenu(new Minuman("Wedang Jahe", 10000));
        twd.tambahMenu(new Minuman("Matcha", 10000));
        twd.tambahMenu(new Minuman("Air Mineral", 5000));
        
        daftarStand.add(twd);
        
        System.out.println("\n>>> Daftar Stand <<<");
        for (int i = 0; i < daftarStand.size(); i++) {
            System.out.println((i+1)+". "+daftarStand.get(i).getNamaStand());
        }
        System.out.print("\nPilih Stand : ");
        int pilih = user.nextInt();
        
        Stand standDiPilih = daftarStand.get(pilih - 1);
        
        System.out.println("\n>>> Metode Pembayaran <<<");
        System.out.println("1. Tunai");
        System.out.println("2. QRIS");
        
        System.out.print("\nPilih : ");
        int pilihBayar = user.nextInt();
        
        Pembayaran pembayaran = null;
        
        if (pilihBayar == 1) {
            pembayaran = new Tunai();
        }
        else if (pilihBayar == 2) {
            pembayaran = new QRIS();
        }
        else {
            System.out.println("Input Invalid!");
            return;
        }
        
        Pesanan pesanan = new Pesanan(pembayaran);
        
        char lagi;
        
        do {
            standDiPilih.tampilMenu();
            System.out.print("\nPilih Menu : ");
            int pilihMenu = user.nextInt();
            
            System.out.print("Jumlah : ");
            int jumlah = user.nextInt();
            
            Menu menuDiPilih = standDiPilih.getDaftarMenu().get(pilihMenu - 1);
            
            DetailPesanan detail = new DetailPesanan(menuDiPilih, jumlah);
            
            pesanan.tambahPesanan(detail);
            
            System.out.print("\nTambah Pesanan Lagi? (y/t) : ");
            
            lagi = user.next().charAt(0);
        } while (lagi == 'y' || lagi == 'Y');
        
        System.out.println("\n>>> Struk Pembelian <<<");
        System.out.println("Stand       : "+standDiPilih.getNamaStand());
        pesanan.tampilStruk();
        user.close();
    }
}
