import java.util.Scanner;

public class sample1 {
    
    //Exercise 4 ― Odd and Even using array
    /* Ask 10 numbers from the user then determine the odd and even numbers entered by the user */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[10];
        int[] evenNum = new int[10];
        int[] oddNum = new int[10];

        System.out.println("***********INPUT***********");
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a number:\t");
            num[i] = scan.nextInt();
        }
        scan.close();


        System.out.println();
        System.out.println("***********OUTPUT***********");
        System.out.println();
        System.out.print("Even Elements:\t");
        for (int i = 0; i < evenNum.length-3;) {
            if (num[i]%2 == 0){
                evenNum[i] = num[i];
            }
            if (evenNum[i] != 0) {
                System.out.print(evenNum[i]);
                if (i >= 0) {
                    System.out.print(", ");
                }
            }
            i++;
        }
        System.out.print(evenNum[evenNum.length-6]);
        System.out.println();

        System.out.print("Odd Elements:\t");
        for (int i = 0; i < oddNum.length-3;) {
            if (num[i]%2 == 1){
                oddNum[i] = num[i];
            }
            if (oddNum[i] != 0) {
                System.out.print(oddNum[i]);
                if (i >= 0) {
                    System.out.print(", ");
                }
            }
            i++;
        }
        System.out.print(oddNum[oddNum.length-3]);
        System.out.println();
    }

}