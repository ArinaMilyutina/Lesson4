import java.util.Arrays;

public class Work8 {
    public static void main(String[] args) {
        int []  array ={1,100,44,33,21,88,5,7,9,10};
        System.out.println(Arrays.toString( array));
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i <  array.length-1; i++) {
                if( array[i] >  array[i+1]){
                    isSorted = false;

                    buf =  array[i];
                     array[i] =  array[i+1];
                     array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString( array));
    }
}