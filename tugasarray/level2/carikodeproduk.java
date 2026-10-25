package tugasarray.level2;
import java.util.Scanner;
public class carikodeproduk {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int kode [] = {101, 105, 110, 115, 120, 125};
        boolean ada = false;
        System.out.print("masukan kode produk  = ");
        int input = inputan.nextInt();
        for(int c = 0; c < kode.length;c++ ){
            if(input == kode[c]) {
                ada = true;
                System.out.println("produk ini memiliki indeks "+c);
            }
        }
       if (!ada) System.out.println("produk tidak ditemukan ");
        inputan.close();
    }
}
