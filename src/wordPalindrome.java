public class wordPalindrome {
 
    public static void main(String[] args) {
       String world="anna";
       if(palindrome(world)){
            System.out.println(world+" is palindrome");
       }else{
        System.out.println(world+" is not palindrome");
       }
    }

    public static boolean palindrome(String str){
        char[] vector=str.toCharArray();
        int left=0, right=vector.length-1;
        while(left<right){
            if(vector[left]==vector[right]){
                left++;
                right--;
            }else{
                return false;
            }
        }

        return true;
    }
}
