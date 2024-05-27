import java.util.Arrays;
import java.util.Random;

public class sumAllNumber {
    
    
    public static void main(String[] args) {
        int[] intArray = generateRandomIntArray(5,10);
        for(int element : intArray){
            System.out.println(element);
        }
        System.out.println("Total is: "+sumAll(intArray));
    }

    public static int sumAll(int[] array){
        
        return Arrays.stream(array).max().orElseThrow();
    }
    public static int[] generateRandomIntArray(int size, int bound) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }

        return array;
    }
}
