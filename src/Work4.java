import java.util.Arrays;

public class Work4 {
    public static void main(String[]args){
        int []array1={1,22,99,55,100};
        int[]array2={33,77,0,0,100};
        double avg1=0;
        double avg2=0;
        for(int i=0;i<5;i++){
            avg1+=array1[i]/array1.length;
            avg2+=array2[i]/array2.length;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Average value in array1="+avg1);
        System.out.println("Average value in array2="+avg2);
        if(avg1==avg2){
            System.out.println("Average values of the arrays are equal.");
        }else if(avg2<avg1){
            System.out.println("Average value in array1>average value in array2.");
        } else if(avg2>avg1) {
            System.out.println("Average value in array2>average value in array1.");
        }
    }
}
