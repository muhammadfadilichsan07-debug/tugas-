package tugasarray.level4;

public class pasangandata {
    public static void main(String[] args) {
        
    
    int[] data = {1, 2, 3, 4, 5};
    for (int i = 0; i < data.length; i++) {
    data[i] = data[i] + data[data.length - 1 - i];
    }
    System.out.println(
    java.util.Arrays.toString(data)
    );



    //perkiraan {6,6,6,10,11}
    //tidak simetris
    //karena data[i] = data[i] + data[data.length - 1 - i]; sensitif terkadap perubahan urutan
    // misal 1,2,3 output{4,4,7} kalau urutannya 2,1,3 outputnya{5,2,8}
    int[] dataa = {1, 2, 3, 4, 5};
    int[] asal = dataa.clone(); 

    for (int i = 0; i < data.length; i++) {
    
        dataa[i] = asal[i] + asal[dataa.length - 1 - i];
        
    }
    System.out.println(
    java.util.Arrays.toString(dataa)
    );

    }
    }