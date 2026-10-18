package tugasloop.level3;
import java.util.Scanner;
public class segitiganomor{
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int tinggi = 0;
        boolean datavalid = false;
        while(!datavalid){
            System.out.print("masukan jumlah pola nomor segitiga ");
            tinggi = inputan.nextInt();
            if(tinggi > 0) datavalid = true;
            else System.out.println("data tidak valid karena harus lebih tinggi dari nol");
        }
        for(int luar = 1;luar <= tinggi;luar++){
            for(int dalam = 1; dalam <= luar;dalam++){
                System.out.print(dalam);
            }
            System.out.println("");
        }
        inputan.close();
    }
}
