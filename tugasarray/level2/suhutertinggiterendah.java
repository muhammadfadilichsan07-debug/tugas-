package tugasarray.level2;

public class suhutertinggiterendah {
    public static void main(String[] args) {
        int suhu[] = {29, 32, 27, 35, 31, 26, 34};
        int tertinggi = suhu[0];
        int terendah = suhu[0];
        int indekstinggi = 0;
        int indeksrendah = 0;
        for(int c = 0;c < suhu.length;c++){
            if(suhu[c] > tertinggi) {
                tertinggi = suhu[c];
                indekstinggi = c;
                }
                 if(suhu[c] < terendah) {
                terendah = suhu[c];
                indeksrendah = c;
                 }
        
         }
         int selisih = tertinggi - terendah;
        System.out.println("suhu tertinggi = "+tertinggi);
        System.out.println("suhu terendah = "+terendah);
        System.out.println("indeks suhu tertinggi = "+indekstinggi);
        System.out.println("indeks suhu terendah = "+indeksrendah);
        System.out.println("selisih suhu = "+selisih);

    }
}