public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        SolLongestPalindromicSubstring element= new SolLongestPalindromicSubstring();
        String s = "cbbd";
        System.out.println(element.longestPalindrome(s));
    }
}



class SolLongestPalindromicSubstring {

    public boolean isTheSame(String s){
        int i=0;
        int j=s.length()-1;
        while(i<s.length() && j>i) {
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            j--;
            i++;
        }


        return true;
    }
    public String longestPalindrome(String s) {
        String result="";
        String aux="";
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>i;j--){
                aux=s.substring(i,j);
                if(isTheSame(aux)){
                    break;
                }


            }
            if(aux.length()>result.length()){
                result=aux;
            }

            aux="";

        }
        return result;
    }
}
/*


Given a string s, return the longest
palindromic

substring
 in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
 */