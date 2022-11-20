// Exercise 1 ― Sum of Each Row 
// Use the table above and use it to create an initialized 2D Array
/* Complete the following program so that it computes the sum of the elements in each
row. And determine the largest result. */

public class twodexercise1 {
    public static void main(String[] args) {
        
        int table[][] = {
            {23,34,50,21,10},
            {12,22,10,6,4},
            {4,67,16,40,56},
            {82,85,29,30,7},
            {6,34,34,45,79}
        };
        int rowSum = 0;
        int largestResult = 0;
        int rowTotal;

        int i;
        for (i = 0; i < table.length; i++) {
            rowTotal = 0;

            int j;
            for (j = 0; j < table.length; j++) {
            rowTotal = rowTotal + table[i][j];
            }
            System.out.println("Sum of Row "+ (i+1) + ":\t" + rowTotal);

            if (rowTotal > largestResult){
                largestResult = rowTotal;
                rowSum = i+1;
            }
        }
        System.out.println("");
        System.out.println("The Largest Sum is Row " +rowSum+ ": "+largestResult);
    }
    
}