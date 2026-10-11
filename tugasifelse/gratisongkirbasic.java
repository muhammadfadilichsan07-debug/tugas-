package tugasifelse;
import java.util.Scanner;
public class gratisongkirbasic {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        int totalBelanja = inputan.nextInt();
        if (totalBelanja >= 100000) {
            System.out.println("Anda mendapatkan gratis ongkir!");
        } else {
            System.out.println("Anda tidak mendapatkan gratis ongkir.");
            inputan.close();
        }
    }
}
