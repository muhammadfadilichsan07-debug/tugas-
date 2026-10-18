package tugasloop.level1;
import java.util.Scanner;
public class perkalian1sampai10 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int data = 0;
        int total = 0;
        boolean datavalid = false;
        while(!datavalid){
            System.out.print("masukan bilangan bulat yang ingin dikali 1 - 10");
            data = inputan.nextInt();
            if(data  >0 && data <11) datavalid = true;
            else System.out.println("data tidak valid");
        }
        for(int f = 1;f <=10;f++ ){
            total = data*f;
            System.out.println(data+"x"+f+"="+total);
        }
    inputan.close();
    }
}
