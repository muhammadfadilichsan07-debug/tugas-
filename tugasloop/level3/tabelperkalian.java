package tugasloop.level3;
import java.util.Scanner;
public class tabelperkalian{
     public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int bawah = 0;
        int samping = 0;
        int hasil = 0;
        boolean datavalid = false;
        while(!datavalid){
        System.out.print("masukan baris tabel = ");
        bawah = inputan.nextInt();
        System.out.print("masukan kolom tabel = ");
        samping = inputan.nextInt();
        if(bawah > 0 && samping > 0) datavalid = true;
        else if(bawah <= 0 && samping >0)
            System.out.println("data tidah valid karena kolom kurang dari 1");
         else if(bawah > 0 && samping <= 0)
            System.out.println("data tidah valid karena baris kurang dari 1");
         else
            System.out.println("data tidah valid karena kolom dan baris kurang dari 1");
        }
        for(int luar = 1; luar <= bawah;luar++){
            
            for(int dalam = 1;dalam <= samping;dalam++){
                hasil = luar * dalam;
                System.out.print(hasil+" ");
            }
            System.out.println("");
        }
        inputan.close();
    }
}