package tugasloop.level1;

import java.util.Scanner;

public class countdown {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int sukupertama= 0;
        boolean datavalid = false;
        while(!datavalid){
            System.out.print("input suku pertama = ");
            sukupertama = inputan.nextInt();
            if(sukupertama > 0) datavalid = true;
            else System.out.println("data tidak valid masukan nilai yang lebih besar dari nol"); 
          
        }
        System.out.print("output = ");
        for(int f = sukupertama;f > 0 ;f--){
        System.out.print(f+" ");
        }
        
        System.out.println("\nstart!");
        inputan.close();
    }   
}
