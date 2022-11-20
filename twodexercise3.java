import java.util.Scanner;

//Exercise 3 - Multiplication
/* Create a program that will ask the user to enter any number of columns and rows for the
multiplication table. Check the sample below. */

public class twodexercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row;
        int column;

        System.out.print("Enter number of Rows: ");
        row = scan.nextInt();

        System.out.print("Enter number of Columns: ");
        column = scan.nextInt();

        scan.close();

        int table[][] = new int[row+1][column+1];

        int i;
        for (i = 1; i < table.length; i++) {
            int j;
            for (j = 1; j < table[i].length; j++) {
                System.out.print(table[i][j]=(i)*(j));
                System.out.print("\t");
            }
            System.out.println();
        }
        
    }   
}
