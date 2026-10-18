package tugasloop.level4;

import java.util.ArrayList;
import java.util.Scanner;

public class temukanbilanganprima {
     public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int input = 0;
        
       
        ArrayList<Integer> daftarprima = new ArrayList<>();
        
            System.out.print("masukan bilangan bulat ");
            input = inputan.nextInt();
            if(input < 2){
                System.out.println("bilangan "+input+" bukan bilangan prima \nkarena salah satu syarat bilangan prima lebih atau sama dengan 2");
                inputan.close();
                return;
            }
            else {
        for(int c = 2;c <= input;c++){
             boolean prima = true;

        for (int f = 2;f <= c / 2;f++){
             if(c % f== 0){
                prima = false; 
                break;
             }
            }
            if(prima) daftarprima.add(c);
        }
            }
           System.out.println("bilangan prima antara angka "+input+" adalah : ");
           System.out.println(daftarprima);
        
        inputan.close();
    }
}
