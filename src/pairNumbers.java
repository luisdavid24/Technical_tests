import java.util.Random;

public class pairNumbers {
 
    public static void main(String[] args) {
        System.out.println("Hello I am david");
        int[] array=generateAnArray(15);
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
    

}
