import java.util.Random;

public class sumAllNumber {
    
    
    public static void main(String[] args) {
        int[] intArray = generateRandomInt();
        for(int element : intArray){
            System.out.println(element);
        }
        System.out.println("Total is: "+sumAll(intArray));
    }

    public static int sumAll(int[] array){
        int total=0;
        for(int element : array){
            total+=element;
        }
        return total;
    }
    public static int[] generateRandomInt(){
        int[] array = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        
        return array;
    }
}
