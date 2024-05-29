import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class removeDuplicates {
    
    
    public static void main(String[] args) {
        int[] array=creatArray(12);
        System.out.println("First");
        System.out.println(Arrays.toString(array));
        int[] arrayResult=remove(array);
        System.out.println("Them");
        System.out.println(Arrays.toString(arrayResult));
        
    }
    public static int[] remove(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        
        return result;
      
    }
    public static int[] creatArray(int size){
        Random random= new Random();
        int[] aux=new int[size];
        for(int i=0;i<size;i++){
            aux[i] = random.nextInt(10);
        }
        return aux;
    }
}
