import java.util.Random;
import java.util.Arrays;

public class pairNumbers {

    public static void main(String[] args) {
        int[] array = generateAnArray(3);
        System.out.println("This is the result: " + sumPairNumber(array));
        System.out.println("This is the array: " + Arrays.toString(array));
    }

    public static int[] generateAnArray(int size) {
        Random random = new Random();
        return random.ints(size, 0, 21).toArray();
    }

    public static int sumPairNumber(int[] array) {
        return Arrays.stream(array)
                     .filter(element -> element % 2 == 0)
                     .sum();
    }
}
