package tugasloop.level4; 
 
 public class sumpasangan{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8,9};
        System.out.println("outputnya : ");
        for(int a = 0;a < arr.length;a++){
            for(int b = a + 1;b < arr.length;b++){
                if(arr[a] + arr[b] == 10)
                    System.out.println("{"+arr[a]+","+arr[b]+"}");
            }
        }
    }
}