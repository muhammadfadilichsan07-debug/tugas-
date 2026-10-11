package tugasifelse;
import java.util.Scanner;
public class kategoriumurlv2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
          System.out.print("masukan umur ");
          int umur = inputan.nextInt();
        while(true)
      
    
        if(umur<0){
            System.out.println("data tidak valid silahkan masukan angka dari nol keatas");
         System.out.print("masukan umur lagi ");
         umur = inputan.nextInt();
        }else{
            break;
        }

        if (umur>=0 && umur <= 5){
            System.out.println("kategori balita");
        }
        else if (umur>=6 && umur<= 12){
            System.out.println("kategori anak-anak");
        }
        else if (umur>+ 13 && umur<=17){
            System.out.println("kategori remaja");
        }
        else if (umur>=18 && umur<= 59)
            System.out.println("kategori dewasa");
        else if (umur>=60){
            System.out.println("kategori lansia");
        }
        inputan.close();
    }
    
}
