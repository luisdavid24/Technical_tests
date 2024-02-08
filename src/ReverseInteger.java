public class ReverseInteger {

    public static void main(String[] args) {

        SolutionReverseInteger element= new SolutionReverseInteger();
        System.out.println(element.reverse(90320));

    }
}



class SolutionReverseInteger {
    public int reverse(int x) {
        if(x < -2147483648 || x>2147483641 ){
            return 0;
        }
        String cadena=String.valueOf(x);
        char[] vector=cadena.toCharArray();
        char[] vector2=cadena.toCharArray();
        char negativo='-';
        char cero='0';
        int j=0;
        if(negativo == vector[0]){
            vector2[j]=negativo;
            j++;
            for(int i=vector.length-1;i>0;i--){
                vector2[j]=vector[i];
                j++;
            }
        }else{
            for(int i=vector.length-1;i>=0;i--){
                vector2[j]=vector[i];
                j++;
            }
        }

        cadena=new String(vector2);
        int result=Integer.parseInt(cadena);
        return result;
    }
}

/*

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21


Constraints:

-231 <= x <= 231 - 1
 */