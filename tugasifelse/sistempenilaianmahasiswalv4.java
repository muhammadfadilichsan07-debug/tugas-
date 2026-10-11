package tugasifelse;
import java.util.Scanner;
public class sistempenilaianmahasiswalv4 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        double nilai;
        double persentaseKehadiran;
        double persentaseTugas;

        while (true) {
                System.out.print("Masukkan nilai mahasiswa: ");
                nilai = inputan.nextDouble();
                System.out.print("Masukkan persentase kehadiran: ");
                persentaseKehadiran = inputan.nextDouble();
                System.out.print("Masukkan persentase tugas yang selesai: ");
                persentaseTugas = inputan.nextDouble();

            if (nilai < 0 || nilai > 100 || persentaseKehadiran < 0 || persentaseKehadiran > 100 || 
                persentaseTugas < 0 || persentaseTugas > 100) {
                System.out.println("Input tidak valid ");
                System.out.println("Silahkan masukkan data diantara 0 sampai 100");

               
            } else {
                break;
            }
            
        }
                                            
         if (nilai >= 60 && persentaseKehadiran >= 75 && persentaseTugas >= 80 ){ 
            System.out.println("Mahasiswa lulus");
        } else {
            System.out.println("Mahasiswa tidak lulus karena :");
        }
         if (nilai >= 0 && nilai < 60)
            System.out.println("Nilai kurang dari 60");
        if ( persentaseKehadiran < 75 )
            System.out.println("Persentase kehadiran kurang dari 75");
        if ( persentaseTugas < 80 )
            System.out.println("Persentase tugas selesai kurang dari 80");
        
        inputan.close();
        
    }
}