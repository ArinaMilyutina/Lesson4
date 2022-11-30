import java.util.Arrays;
import java.util.Scanner;

public class Work3 {
    public static void main(String[]args){
        System.out.println("Enter the size of array-");
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=10*i;
            array[i]=(int)(10*Math.random());
        }
        int max=array[0];
        int min=array[0];
        int avg=0;
        for (int j : array) {
            if (max < j)
                max = j;
            if (min > j)
                min = j;
            avg += j / array.length;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max element in the array="+max);
        System.out.println("Min element in the array="+min);
        System.out.println("Average value="+avg);
    }
}
