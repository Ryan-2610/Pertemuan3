
package tugasper3;

public class TugasPer3 {
void mahasiswa(String nama,String nim,String kelas){
    System.out.println("Nama    : "+nama);
    System.out.println("NIM     : "+nim);
    System.out.println("Kelas   : "+kelas);
}

    public static void main(String[] args) {
      String nama ="Ryan akta Ramadhan";
      String nim = "2255201033";
      String kelas = "Semester 3 A";
     TugasPer3 q = new TugasPer3();
     q.mahasiswa(nama, nim, kelas);
        System.out.println("");
     classnilai w = new classnilai();
       w.nilaiT(85, 44, 89, 68);
      
    }
    
}
