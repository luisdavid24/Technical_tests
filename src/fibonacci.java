import java.util.Arrays;

public class fibonacci {
    
    public static void main(String[] args) {
        System.out.println("Hello I will be a king");
        int[] array = generateFibonacci(9);
        System.out.println("This is the array: " + Arrays.toString(array));
    }

    public static int[] generateFibonacci(int size){
        if(size>=3){
            int[] aux=new int[size];
            aux[0]=1;
            aux[1]=1;
            for(int i=2;i<size;i++){
                aux[i]=aux[i-1]+aux[i-2];
            }
            return aux;
        }else if(size>2){
            int[] aux={1, 1};
            return aux;
        }else if(size==1){
            int[] aux={1};
            return aux;
        }
        return null;
    }
}
