package tugasifelse;
import java.util.Scanner;
public class hariangkalv2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan angka hari (1-7): ");
        int hari = inputan.nextInt();
        String namaHari;
        while (true) {
            if (hari < 1 || hari > 7) {
                System.out.println("Angka tidak valid. Harap masukkan angka antara 1 hingga 7.");
                System.out.print("Masukkan angka hari (1-7): ");
                hari = inputan.nextInt();
            } else {
                break;
            }
        }
        
        
        if (hari == 1) {
            namaHari = "Minggu";
        } else if (hari == 2) {
            namaHari = "Senin";
        } else if (hari == 3) {
            namaHari = "Selasa";
        } else if (hari == 4) {
            namaHari = "Rabu";
        } else if (hari == 5) {
            namaHari = "Kamis";
        } else if (hari == 6) {
            namaHari = "Jumat";
        } else if (hari == 7) {
            namaHari = "Sabtu";
        } else {
            namaHari = "Angka tidak valid. Harap masukkan angka antara 1 hingga 7.";
        }
        
        System.out.println(namaHari);
        inputan.close();
    }
    
}
