import java.util.Arrays;

public class Work6 {
    public static void main(String[]args){
        int []array0=new int[10];
        for(int i=0;i<array0.length;i++) {
            array0[i] = 10 * i;
            array0[i] = (int) (10 * Math.random());
        }
        System.out.println("Array 1: "+ Arrays.toString(array0));
            for (int i=0;i<10;i++){
                if(i%2!=0){
                    array0[i]=0;
                }
        }
        System.out.println("Array 2: "+Arrays.toString(array0));

    }
}
