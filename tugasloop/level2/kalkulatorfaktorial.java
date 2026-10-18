package tugasloop.level2;
import java.util.Scanner;
public class kalkulatorfaktorial {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int data = 0;
        int total = 1;
        boolean datavalid = false;
        while(!datavalid){
            System.out.print("masukan bilangan faktorial ");
            data = inputan.nextInt();
            if(data >= 0) datavalid = true;
            else System.out.println("data tidak valid karena kurang dari nol");
        }
        for(int f = data;f > 0;f-- ){
            total = total*f;  
        }
         System.out.println("hasil dari "+data+"! = "+total);
    inputan.close();
    }
}

