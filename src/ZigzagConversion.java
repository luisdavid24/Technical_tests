import java.util.Arrays;

public class ZigzagConversion {

    public static void main(String[] args) {

        SolutionZigzagConversion element= new SolutionZigzagConversion();
        String variable="PAYPALISHIRING";
        int rows=4;
        System.out.println(element.convert(variable,rows));

    }


}

class SolutionZigzagConversion {
    public String convert(String s, int numRows) {
                if (numRows == 1 || s.length() <= numRows) {
                    return s;
                }

                StringBuilder[] rows = new StringBuilder[numRows];
                for (int i = 0; i < numRows; i++) {
                    rows[i] = new StringBuilder();
                }

                int currentRow = 0;
                boolean goingDown = false;

                for (char c : s.toCharArray()) {
                    rows[currentRow].append(c);
                    System.out.println(currentRow);
                    if (currentRow == 0 || currentRow == numRows - 1) {
                        goingDown = !goingDown;
                    }
                    currentRow += goingDown ? 1 : -1;
                }



                StringBuilder result = new StringBuilder();
                for (StringBuilder row : rows) {
                    result.append(row);
                }
                return result.toString();
            }
}

        /*
        int columns=s.length();
        String[][] matrix= new String[numRows][columns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <  columns; j++) {
                    matrix[i][j] = ".";
            }
        }

        char[] letras = s.toCharArray();




        int k=0,posColumna=0,posfila=0;

        while(k<letras.length){
            for(int i=0;i<numRows;i++){
                if(k<letras.length){
                    matrix[posfila][posColumna]=new String(String.valueOf(letras[k]));
                    posfila++;
                    k++;
                }else{
                    break;
                }
            }
            posfila--;
            for(int i=0;i<numRows-2;i++){
                if(k<letras.length){
                    posfila--;
                    posColumna++;
                    matrix[posfila][posColumna] =new String(String.valueOf(letras[k]));
                    k++;
                }else{
                    break;
                }

            }
            posColumna++;
            posfila--;


        }

        String result="";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < columns; j++) {
                if(matrix[i][j]!="."){
                    result=result.concat(matrix[i][j]);
                }

            }
        }
        return result;*/






/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000

 */