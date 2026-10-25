package tugasarray.level1;

public class daftarnilaimahasiswa {
    public static void main(String[] args) {
        int daftarnilai[] = {80, 75, 90, 65, 85};
        System.out.println("nilai dari semua mahasiswa adalah : ");
        for(int nilai = 0;nilai < daftarnilai.length;nilai++){
            System.out.print(daftarnilai[nilai]+" ");
        }
        System.out.println("\nnilai mahasiswa pada indeks kedua adalah : "+daftarnilai[2]);
    }
}
//perbedaan indeks array dan urutan mahasiswa adalah urutan dimulai dari 1 sementara indeks array dimulai dari 0