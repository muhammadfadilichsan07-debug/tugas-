package tugasarray.level3;

public class dataduplikat {
    public static void main(String[] args) {
        int[] nomorpeserta = {101, 102, 101, 103, 102, 104, 105, 103};
        int n = nomorpeserta.length;
        System.out.print("Nomor Duplikat: ");
        int[] dicetakduplikat = new int[n];
        int countduplikat = 0;
        
        for (int i = 0; i < n; i++) {
            int hitung = 0;
            for (int j = 0; j < n; j++) {
                if (nomorpeserta[i] == nomorpeserta[j]) {
                    hitung++;
                }
            }
           
            if (hitung > 1) {
                boolean sudahada = false;
                for (int k = 0; k < countduplikat; k++) {
                    if (dicetakduplikat[k] == nomorpeserta[i]) {
                        sudahada = true;
                        break;
                    }
                }
                if (!sudahada) {
                    dicetakduplikat[countduplikat++] = nomorpeserta[i];
                    System.out.print(nomorpeserta[i] + " ");
                }
            }
        }
        System.out.println();

        int[] tempunik = new int[n];
        int jumlahunik = 0;

        for (int i = 0; i < n; i++) {
            boolean isduplikat = false;
          
            for (int j = 0; j < jumlahunik; j++) {
                if (nomorpeserta[i] == tempunik[j]) {
                    isduplikat = true;
                    break;
                }
            }
            
            if (!isduplikat) {
                tempunik[jumlahunik] = nomorpeserta[i];
                jumlahunik++;
            }
        }

        int[] arrayunik = new int[jumlahunik];
        System.out.print("Array Hasil Unik: [");
        for (int i = 0; i < jumlahunik; i++) {
            arrayunik[i] = tempunik[i];
            System.out.print(arrayunik[i] + (i == jumlahunik - 1 ? "" : ", "));
        }
        System.out.println("]");
        
        System.out.println("Jumlah Peserta Unik: " + jumlahunik);
    }
}