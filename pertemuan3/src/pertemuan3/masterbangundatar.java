
package pertemuan3;

public class masterbangundatar {



void persegipanjang(int sisi){
    int luas = sisi*sisi;
    System.out.println("sisi = "+sisi);
    System.out.println("Luas persegi = "+luas);
}
    
    public static void main(String[] args) {
        int sisi = 10;
      masterbangundatar p = new masterbangundatar();
      p.persegipanjang(sisi);
      int sisifungsi = 30;
      contohbt d = new contohbt();
        System.out.println("Luas PersegiFungsi = "+d.hitungpersegifungsi(sisifungsi));
    }
    
}
