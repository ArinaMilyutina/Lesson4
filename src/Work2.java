import java.util.Arrays;
import java.util.Scanner;
public class Work2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 2, 4, 5, 6, 7, 8, 9, 22};
        int count = 0;
        System.out.print("Enter the number,please.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int k : array1) {
            if (k != number) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int j : array1)
            if (j != number) {
                array2[index] = j;
                index++;
            }
        System.out.println(Arrays.toString(array2));
    }
}

