
package Smart_Canteen2;
import java.util.ArrayList;

public class Stand {
    private String namaStand;
    private ArrayList<Menu> daftarMenu;
    
    public Stand(String namaStand) {
        this.namaStand = namaStand;
        daftarMenu = new ArrayList<>();
    }
    public String getNamaStand() {
        return namaStand;
    }
    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }
    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }
    public void tampilMenu() {
        System.out.println("\n>>> "+namaStand+" <<<");
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu m = daftarMenu.get(i);
            System.out.println((i+1)+". "+m.getNama()+" | Rp"+m.getHarga());
        }
    }
}
