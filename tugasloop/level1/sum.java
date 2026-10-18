package tugasloop.level1;
import java .util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        int maxdata = 0;
        int total = 0;
        boolean datavalid = false;
        while(!datavalid){
            System.out.print("input data maksimal = ");
            maxdata = inputan.nextInt();
            if(maxdata>0)  datavalid = true;
            else  System.out.println("nilai data harus lebih besar dari nol");
        }
        for(int f = 1;f <=maxdata;f++){
            total = total + f;
        }
        System.out.print("sum = "+total);

        inputan.close();
    }
    
}
