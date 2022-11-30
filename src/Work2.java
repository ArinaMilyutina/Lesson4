import java.util.Arrays;
import java.util.Scanner;
public class Work2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 22};
        int[] array2 = null;
        System.out.print("Enter the number,please.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < array1.length; i++) {
                array2 = new int[array1.length - 1];
                System.arraycopy(array1, 0, array2, 0, i);
                System.arraycopy(array1, i + 1, array2, i, array1.length - 1 - i);
            }
        if (array1[9] == number) {
            System.out.println("New array-" + Arrays.toString(array2));
        } else {
            System.out.println("The entered number is not in the array.");
        }
    }
}


