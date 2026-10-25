package tugasarray.level4;

public class debuggingratarata {
    public static void main(String[] args) {
        int[] scores = {80, 70, 90, 60};
    int total = 0;
    for (int i = 0; i < scores.length; i++) {
    total += scores[i];
    }
    double average =(double) total / scores.length;
    System.out.println(average);
    //tidak berjalan karena di loop terakhir array tidak terdeteksi
    //kesalahan di kode i <= scores.length harusnya i < scores.length
    //lalu di  double average = total / scores.length; sebenarnya bisa berfungsi
    //hanya jika rata-ratanya desimal contoh 76,45 maka otomatis dibulatkan jadi 76 sehingga kurang akurat
   // mengubah total jadi double belum cukup menyelesaikan masalah karena masalah utama ada di i <= scores.length
}
}