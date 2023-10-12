
package tugasper3;

public class classnilai {
  double nilaiT(int bingg, int mtk, int fisika, int aswaja){
      int total = bingg+mtk+fisika+aswaja;
      double rata = total/4;
      
      
   if(bingg >70 && bingg<=100){
       System.out.println("Anda LULUS Mata Kuliah Bahasa Inggris dengan Nilai = "+bingg);
   }else{
       System.out.println("Anda Harus Mengulang Mata Kuliah Bahasa Inggris Dengan NILAi: "+bingg);
   }
   if(mtk >70 && mtk<=100){
       System.out.println("Anda LULUS Matakuliah Matematika dengan Nilai                : "+mtk);
   }else{
       System.out.println("Anda Harus Mengulang Mata Kuliah Dengan NILAi: "+mtk);
   }  
     if(fisika >70 && fisika<=100){
       System.out.println("Anda LULUS Matakuliah Fisika dengan Nilai: "+fisika);
   }else{
       System.out.println("Anda Harus Mengulang Mata Kuliah Fisika Dengan NILAi: "+fisika);
   } 
     
     if(aswaja >=70 && aswaja<=100){
       System.out.println("Anda LULUS Matakuliah Aswaja dengan Nilai: "+aswaja);
   }else{
       System.out.println("Anda Harus Mengulang Mata Kuliah ASWAJA dengan Nilai: "+aswaja);
         System.out.println(" ");
   }
     if (rata >70 && rata <=100){
         System.out.println("");
         System.out.println("Anda Lulus Semester Ini Selamat!!"+"\nDengan Nilai = "+rata);
     }else{
         System.out.println("");
         System.out.println("Anda Harus Mengulang Semester ini!!!"+"\nDengan Nilai: "+rata);
         
     }
      return  rata;
      
     
    }
  }
     

