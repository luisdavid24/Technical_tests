import java.util.Arrays;

public class fibonacci {
    
    public static void main(String[] args) {
        System.out.println("Hello I will be a king");
        int[] array = generateFibonacci(9);
        System.out.println("This is the array: " + Arrays.toString(array));
    }

    public static int[] generateFibonacci(int size){
        if (size <= 0) {
            return new int[0];
        }
        int[] fibonacciArray = new int[size];
        if (size > 0) {
            fibonacciArray[0] = 1;
        }
        if (size > 1) {
            fibonacciArray[1] = 1;
        }
        for (int i = 2; i < size; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        
        return fibonacciArray;
    }
}
