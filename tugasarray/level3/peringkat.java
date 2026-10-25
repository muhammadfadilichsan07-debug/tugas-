package tugasarray.level3; 
public class peringkat{
public static void main(String[] args) {
    int nilai[] = {78, 90, 65, 90, 85, 72, 95, 85};
    
    for(int i = 0;i < nilai.length;i++){
        for(int j = 0;j < nilai.length;j++){
            if(nilai[j] < nilai[i]){
                int tempat = nilai[i];
                nilai[i] = nilai[j];
                nilai[j]= tempat;
            }
    }
    }
    System.out.print("nilai berurutan dari yang terbesar");
    for(int i = 0;i < nilai.length;i++){
         System.out.print(nilai[i]+" ");
    }
     System.out.println("\n");
     System.out.print("tiga nilai tertinggi yang berbeda = ");
     int toptiga[] = new int[3];
     int isi = 0;
        for(int i = 0;i < nilai.length;i++){
            int angkaini = nilai[i];
            boolean ada = false;
               for(int k = 0;k < isi;k++){
                if(toptiga[k] == angkaini){
                    ada = true;
                }
               }
               if(ada == false){
                toptiga[isi] = angkaini;
                isi++;
               }
               if(isi == 3) {
                break;
        }
        }
           for(int i = 0;i < 3;i++){
            System.out.print(toptiga[i]+" ");
           }
        System.out.println("\n");
        System.out.println("daftar peringkat mahasiswa");
         for(int i = 0;i < nilai.length;i++){
            int nilaimahasiswa = nilai[i];
            int jumlahlebihpintar = 0;

        for(int j = 0;j < nilai.length;j++){
            if(nilai[j] > nilaimahasiswa){
                jumlahlebihpintar++;
            }
        }
        int ranking = jumlahlebihpintar + 1;
        System.out.println("mahasiswa ke "+i+"| nilai "+nilaimahasiswa+"| rangking "+ranking);
    }
}
}