import java.util.Arrays;
import java.util.Scanner;
public class Work5 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int  size = 0;
        while ( size<=5||size>10) {
            if ( scanner.hasNextInt()) {
                 size =  scanner.nextInt();
                if ( size <= 5 ||  size>10) {
                    System.out.println("Error!!!Enter the size of array,again:");
                }
            } else {
                System.out.println("Error!!!Enter the size of array,again:");
                 scanner.next();
            }
        }
        int[]  array1 = new int[ size];
        int  k = 0;
        for (int i = 0; i <  size; i++) {
             array1[i] = (int) (Math.random() * ( size + 1));
            if ( array1[i] % 2 == 0) {
                 k++;
            }
        }
        System.out.println(Arrays.toString( array1));
        int[] array2 = new int[k];
        int index = 0;
        for (int i = 0; i <  size; i++) {
            if ( array1[i] % 2 == 0) {
                 array2[index] =  array1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}