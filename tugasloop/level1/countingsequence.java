package tugasloop.level1;
import java.util.Scanner;
public class countingsequence {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int banyakdata = 1;
         boolean inputvalid= false;
        while (!inputvalid) {
        System.out.print("input banyak data yang ingin dicari = ");
        banyakdata = inputan.nextInt();
       
        if(banyakdata > 0)  inputvalid = true;
         else System.out.println("input tidak valid masukan bilangan bulat diatas nol");
        
        }
        System.out.print("output = ");
         for(int f = 1;f <= banyakdata;f++){
        System.out.print(f+" ");
        } 
        inputan.close();
    }
}