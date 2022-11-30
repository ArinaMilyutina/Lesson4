import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Work1 {
    public static void main(String[]args){
        Integer[]array=new Integer[]{1,2,3,8,9,10,22,33,1,88};
        System.out.println("Enter the number,please.");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        List<Integer>inList=new ArrayList<>(Arrays.asList(array));//преобразование массива в список массивов
        if(inList.contains(number)){ //contains возвращает логическое значение,указывающее,содержит ли список элемент number
            System.out.println("This number is included in the array");
        }else System.out.println("This number is not included in the array");
    }
}
