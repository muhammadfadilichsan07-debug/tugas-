package tugasloop.level2;
import java.util.Scanner;
public class bilanganprima {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int input = 0;
        int hasil = 0;
        boolean prima = true;
        
        
            System.out.print("masukan bilangan bulat ");
            input = inputan.nextInt();
            if(input < 2){
                System.out.println("bilangan "+input+" bukan bilangan prima \nkarena salah satu syarat bilangan prima lebih atau sama dengan 2");
                inputan.close();
                return;
            }
            else {
        
        for (int f = 2;f <= input / 2;f++){
            hasil = input % f;
             if(hasil == 0){
                 System.out.println(input+" tidak termasuk kedalam bilangan prima");
                prima = false; 
                break;
             }
            }
            }
             if(prima ) System.out.println(input+" termasuk kedalam bilangan prima");
        
        inputan.close();
    }
}
