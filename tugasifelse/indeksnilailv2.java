package tugasifelse;
import java.util.Scanner;
public class indeksnilailv2 {
    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        System.out.print("berapa nilai anda ");
        double nilai = inputan.nextDouble();
        char indeksnilai = 'k';
        while (true) {
            if (nilai < 0 || nilai > 100) {
                System.out.println("Input tidak valid ");
                System.out.println("Silahkan masukkan data diantara 0 sampai 100");
                System.out.print("berapa nilai anda ");
                  nilai = inputan.nextDouble();
            } else {
                break;
            }
        }
        if (nilai>=80) 
            indeksnilai = 'A';
        
        else if (nilai<80 && nilai>=70)
            indeksnilai = 'B';
            
         else if (nilai<70 && nilai>=60)
            indeksnilai = 'C';
        
         else if (nilai<60 && nilai>=50)
            indeksnilai = 'D';
         
         else if (nilai<50 && nilai>=0)
            indeksnilai = 'E';
    
        System.out.println("indeks nilai anda adakalah "+indeksnilai);
          inputan.close();
     
    }
    
}
