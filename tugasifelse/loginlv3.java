package tugasifelse;
import java.util.Scanner;
public class loginlv3 {
public static void main(String[] args) {
    Scanner inputan = new Scanner (System.in);
    String nama= "admin";
    String sandi = "12345";
    System.out.print ("masukan username =");
    String inputnama = inputan.nextLine();
    System.out.print("masukan password =");
    String inputsandi = inputan.nextLine();
    if (inputnama.equals(nama) && inputsandi.equals(sandi)){
        System.out.println("login sukses");

    }
    else if (!inputnama.equals(nama) && inputsandi.equals(sandi)){
        System.out.println("login gagal karena username salah");

    }
    else if (inputnama.equals(nama) && !inputsandi.equals(sandi)){
        System.out.println("login gagal karena password salah");
    }
    else if (!inputnama.equals(nama) && !inputsandi.equals(sandi)){
        System.out.println("login gagal karena username dan password salah");
    }
    inputan.close();
}



    
}

