package tugasifelse;
import java.util.Scanner;
public class perbandinganbilanganlv2 {
    public static void main(String[]args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("masukan bilangan a");
        
        double a = inputan.nextDouble();
        System.out.print("masukan bilangan b");
        double b = inputan.nextDouble();
        if (a>b){
            System.out.println("bilangan a lebih besar dari bilangan b");
        }
        else if (b>a){
            System.out.println("bilangan b lebih besar dari bilangan a");
        }
        else if (a==b){
            System.out.print("bilangan a dan b sama besar");
        }
        inputan.close();
    }
    
}
