public class factorialNumber {
    
    public static void main(String[] args) {
        System.out.println("This is the result: "+factorial(5));
        
    }

    public static int factorial(int number){
        int aux=1;
        for(int i=number;i>=0;i--){
            if(i==0){
                return aux;
            }
            aux*=i;
        }
        return aux;
    }
    
}
