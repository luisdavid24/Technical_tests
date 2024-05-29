public class factorialNumber {
    
    public static void main(String[] args) {
        System.out.println("This is the result: "+factorial(5));
        
    }

    public static int factorial(int number){
        int aux = 1;
        for (int i = 1; i <= number; i++) {
            aux *= i;
        }
        return aux;
        
    }
    
}
