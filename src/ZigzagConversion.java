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
        int columns=s.length();
        String[][] matrix= new String[numRows][columns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <  columns; j++) {
                    matrix[i][j] = "*";
            }
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("          //////        "+columns);
        int k=0,aux=1,posColumna=0,posfila=0;
        while(k<12){
            for(int i=0;i<numRows;i++){
                matrix[posfila][posColumna] = "k";
                matrix[posfila][posColumna] = s.substring(k,aux);
                posfila++;
                k++;
                aux++;

            }
            posfila--;
            for(int i=0;i<numRows-2;i++){
                posfila--;
                posColumna++;
                matrix[posfila][posColumna] = s.substring(k,aux);
                k++;
                aux++;
            }
            posColumna++;
            posfila--;

        }



        //matrix[0][0] = s.substring(1,2);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        return null;
    }
}




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