import java.util.ArrayList;
import java.util.Scanner;

// Ask 10 numbers from the user then determine the odd and even numbers entered by the
// user.

public class sample {
    public static void main(String[] args) {
        int num[] = new int[10];
        ArrayList <Integer> evenNum = new ArrayList<Integer>();
        ArrayList <Integer> oddNum = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.println("***********INPUT***********");
        System.out.println();

        for (int i = 0; i < 10; i++) {
           System.out.print("Enter a Number: ");
            num[i] = scan.nextInt();

            if ((num[i] % 2) == 0) {
                evenNum.add(num[i]);
            } else {
                oddNum.add(num[i]);
            }
        }
        scan.close();

        System.out.println();
        System.out.println("***********OUTPUT***********");
        System.out.println();
        System.out.print("Even Elements:\t");
        for (int i = 0; i < evenNum.size()-1; i++) {
            System.out.print(evenNum.get(i)+", ");
        }
        System.out.print(evenNum.get(evenNum.size()-1));
        System.out.println();


        System.out.print("Odd Elements: \t");
        for (int i = 0; i < oddNum.size()-1; i++) {
            System.out.print(oddNum.get(i)+", ");
        }
        System.out.print(oddNum.get(oddNum.size()-1));
        System.out.println();
    }
}