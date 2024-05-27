import java.util.Random;

public class maximumElement {

    public static void main(String[] args) {
       float[] floatArray = new float[10];
       Random random = new Random();
        
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = random.nextFloat()*9;
        }
        for (float num : floatArray) {
            System.out.println(num);
        }
        max(floatArray);
    }

    public static void max(float[] array){
        float max=array[0];
        for (float num : array) {
            if(num>max){
                max=num;
            }
        }
        System.out.println("This is max number");
        System.out.println(max);
    }
}
