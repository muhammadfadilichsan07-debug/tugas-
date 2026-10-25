package tugasarray.level1;

public class persediaanbarang {
    public static void main(String[] args) {
        int barang [] = {12, 10, 15, 6};
        System.out.println("persediaan produk pertama = "+barang[0]);
        System.out.println("persediaan barang terakhir = "+barang[barang.length - 1]);
        System.out.print("daftar seluruh persediaan barang : ");
        for(int f = 0;f < barang.length;f++)
            System.out.print(barang[f]+" ");

    }
}
// bila mengambil data barang[4] di kode ini maka tidak akan ada data yang terambil
// karena arry dimulai dari 0 jadi kalu ada empat barang urutannya akan jadi 0, 1, 2, 3