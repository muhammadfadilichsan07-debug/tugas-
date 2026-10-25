package tugasarray.level2;

public class analisisnilaiujian {
    public static void main(String[] args) {
    double nilai[] = {75, 80, 65, 90, 55, 85, 70, 95};
    double total = 0;
    double lulus = 0;
        for(int s = 0;s < nilai.length;s++){  
            total = total + nilai[s];
            
        }
    double rata = total / nilai.length;
    System.out.println("rata-rata = "+rata);
    System.out.println("nilai yang melebihi rata rata = ");
    for(int d = 0;d < nilai.length;d++){
    if (nilai[d] > rata){
         System.out.print(nilai[d]+" ");
    }
    if (nilai[d]>=70) {lulus++;}
    }
     
    System.out.println("jumlah siswa lulus = "+lulus);
    double persen = (lulus/nilai.length)*100;
    System.out.println("persentase lulus = "+persen+"%");
    }
}
