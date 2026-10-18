package tugasloop.level2;

import java.util.Scanner;

public class sumgenappositif {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        int maxdata = 0;
        int total = 0;
        boolean datavalid = false;
        while(!datavalid){
            System.out.print("input data maksimal bilangan genap lebih dari 0 = ");
            maxdata = inputan.nextInt();
            if(maxdata > 0  && maxdata % 2 == 0)  datavalid = true;
            else if(maxdata <= 0  && maxdata % 2 == 0)
                System.out.println("nilai data harus lebih besar dari nol");
            else if(maxdata > 0  && maxdata % 2 == 1)
                System.out.println("nilai data harus bilangan genap");
            else 
                System.out.println("nilai data harus lebih besar dari nol dan termasuk bilangan genap");
        }
        for(int f = 2;f <= maxdata;f+=2){
            total = total + f;
        }
        System.out.print("sum = "+total);

        inputan.close();
    }
    
}


