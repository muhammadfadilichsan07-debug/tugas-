package tugasloop.level3;
import java.util.Scanner;
public class polasegiempat {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int bawah = 0;
        int samping = 0;
        boolean datavalid = false;
        while(!datavalid){
            System.out.print("masukan jumlah baris = ");
            bawah = inputan.nextInt();
             System.out.print("masukan jumlah kolom = ");
            samping = inputan.nextInt();
            if(bawah > 0 && samping > 0) datavalid = true;
            else if(bawah <= 0 && samping > 0) 
                System.out.println("data tidak valid karena baris kurang dari 1");
            else if(bawah > 0 && samping <= 0) 
                System.out.println("data tidak valid karena kolom kurang dari 1");
            else
                System.out.println("data tidak valid karena baris dan kolom kurang dari 1");
        }
        for(int luar = 0;luar < bawah;luar++){
            for(int dalam = 0;dalam < samping;dalam++){
                System.out.print("*");
            }
            System.out.println("");
        }
        inputan.close();
    }

}