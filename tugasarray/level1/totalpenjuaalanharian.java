package tugasarray.level1;

public class totalpenjuaalanharian {
    public static void main(String[] args) {
        int total = 0;
        int jual[] ={100000, 150000, 125000, 200000, 175000};
        for(int f = 0;f < jual.length;f++){
            total = total + jual[f];
        }
        System.out.println("yotal penjualan = Rp "+total+",00");
    }
}
