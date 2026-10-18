package tugasloop.level3;
import java.util.Scanner;
public class segitigasikusiku {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int tinggi = 0;
        boolean datavalid = false;
        while(!datavalid){
            System.out.print("masukan tinggi segitiga ");
            tinggi = inputan.nextInt();
            if(tinggi > 0) datavalid = true;
            else System.out.println("data tidak valid karena harus lebih tinggi dari nol");
        }
        for(int luar = 0;luar < tinggi;luar++){
            for(int dalam = 0; dalam <= luar;dalam++){
                System.out.print("*");
            }
            System.out.println();
        }
        inputan.close();
    }
}