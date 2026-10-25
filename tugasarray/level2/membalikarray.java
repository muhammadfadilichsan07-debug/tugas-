package tugasarray.level2;

public class membalikarray {
    public static void main(String[] args) {
        
    
     int[] data = {2, 4, 6, 8, 10, 12};
    int depan = 0;        
    int belakang = data.length - 1;  
    System.out.print("data sebelum dibalik = "); 
    for (int a = 0;a < data.length;a++) {
        System.out.print(data[a]+" ");
    }  
        while (depan < belakang) {
    
            int letak = data[depan];
            data[depan] = data[belakang];
            data[belakang] = letak;
            depan++;
            belakang--;
        }
    System.out.print("\ndata setelah dibalik = "); 
    for (int b = 0;b < data.length;b++) {
        System.out.print(data[b]+" ");
    }  
     }        
}
