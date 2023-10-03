package array; 
import java.util.Arrays;

public class nonAmstrong {
    public static void main(String[] args) {
        int[] array = { 1,22,45,67,153, 370 };

        System.out.println("non amstrong number in an arrayis:" + Arrays.toString(getNonArmstrongNumbers(array)));
    }

    public static int[] getNonArmstrongNumbers(int[] array) {
        int[] nonArmstrongNumbers = new int[array.length];
        int count = 0;

        for (int number : array) {
            if (!isArmstrongNumber(number)) {
                nonArmstrongNumbers[count++] = number;
            }
        }

        return Arrays.copyOf(nonArmstrongNumbers, count);
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;


    public static int getNumberOfDigits(int number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
