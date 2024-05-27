import java.util.Random;

public class maximumElement {

    public static void main(String[] args) {
        float[] floatArray = generateRandomFloatArray(10);

        for (float num : floatArray) {
            System.out.println(num);
        }
        float maxNumber = max(floatArray);
        System.out.println("The maximum number is: " + maxNumber);
    }

    public static float max(float[] array){
        float max=array[0];
        for (float num : array) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static float[] generateRandomFloatArray(int size) {
        float[] array = new float[size];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextFloat() * 9;
        }
        
        return array;
    }
}
