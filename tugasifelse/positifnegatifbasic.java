package tugasifelse;
import java.util.Scanner;
public class positifnegatifbasic {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("nilai bilangan = ");
        double nilai = inputan.nextDouble();
        String sifat = "contoh";
        if (nilai < 0) 
            sifat = "negatif";
        else if (nilai > 0) 
            sifat = "positif";
        else if (nilai==0)
            sifat = "nol";
        
        System.out.println("Bilangan " + nilai + " termasuk dalam bilangan " + sifat);
        inputan.close();
    }

}
