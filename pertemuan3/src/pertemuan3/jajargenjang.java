
package pertemuan3;

import static pertemuan3.jgfungsiS.fungsijg;

public class jajargenjang {
    static void prosedurjg(int alas, int tinggi){
        int luasjg = alas*tinggi;
        System.out.println("Alas = "+alas);
        System.out.println("tinggi = "+ tinggi);
        System.out.println("Luas Jajargenjang adalah = "+luasjg);
    }
    public static void main(String[] args) {
        int alas = 25;
        int tinggi = 10;
        prosedurjg(alas, tinggi);
        
        int alasfungsi = 23;
        int tinggifungsi = 12;
        System.out.println("Luas Jajar Genjang Fungsi = "
        +fungsijg(alasfungsi, tinggifungsi));
    }
    
}
