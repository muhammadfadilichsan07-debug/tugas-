package tugasifelse;
import java.util.Scanner;
public class cekumurbasic {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan umur Anda: ");
        int umur = inputan.nextInt();
        if (umur >= 17) {
            System.out.println("anda sudah dewasa");
        } else {
            System.out.println("anda masih dibawah umur");
        }
        inputan.close();
    }
    
}
