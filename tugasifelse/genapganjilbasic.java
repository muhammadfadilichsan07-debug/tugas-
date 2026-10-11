package tugasifelse;
import java.util.Scanner;   
public class genapganjilbasic {

    public static void main(String[]args){
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan bilangan = ");
        int bilangan = inputan.nextInt();
        String sifat = "contoh";
        if (bilangan % 2 == 0) {
            sifat = "genap";
        } else if (bilangan % 2 == 1) {
            sifat = "ganjil";
        }
        System.out.println("Bilangan " + bilangan + " termasuk kedalam bilangan " + sifat);
        inputan.close();
    }
    
}
