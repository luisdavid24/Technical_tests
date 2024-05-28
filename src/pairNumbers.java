import java.util.Random;

public class pairNumbers {
 
    public static void main(String[] args) {
        int[] array=generateAnArray(3);
        System.out.println("This is the result: "+sumPairNumber(array));
        System.out.println("This is the array: ");
        seeArray(array);
    }
    public static int[] generateAnArray(int size){
        int[] array = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        
        return array;
    }

    public static void seeArray(int[] array){
        for(int element:array){
            System.out.print(element+" ");
        }
    }
    public static int sumPairNumber(int[] array){
        int aux=0;
        for(int element:array){
            if(element%2==0){
                aux+=element;
            }
        }
        return aux;
    }

}
