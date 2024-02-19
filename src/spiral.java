import javax.swing.plaf.synth.SynthTextAreaUI;

public class spiral {

    public static void main(String[] args) {
        Spirall element= new Spirall();
        element.spiral(3,4);

    }
}


class Spirall {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int number = 1;
        int topRow = 0, bottomRow = rows - 1;
        int leftCol = 0, rightCol = columns - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            for (int col = leftCol; col <= rightCol; col++) {
                array[topRow][col] = number++;
            }
            topRow++;

            for (int row = topRow; row <= bottomRow; row++) {
                array[row][rightCol] = number++;
            }
            rightCol--;
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    array[bottomRow][col] = number++;
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    array[row][leftCol] = number++;
                }
                leftCol++;
            }
        }



        return array;
    }
}