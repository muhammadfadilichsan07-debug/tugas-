package tugasarray.level1;

public class analisisoutputprogram {
    public static void main(String[] args) {
        
    
    int[] numbers = {10, 20, 30, 40};
for (int i = 0; i < numbers.length; i++) {
System.out.println(numbers[i] + i);
}
}
}
//perkiraan output sebelum dijalankan adalah 10 , 21, 32, 43
// karena komputer menganggap + di numbers[i] + i sebagai operasi matematika bukan perintah penggabungan
//nilai i urutan dari iterasi pertama - keempat = 0, 1, 2, 3
//karena number.lenght dimulai dari 1 sementara array dari 0 kakanya ditulis < bukan <=