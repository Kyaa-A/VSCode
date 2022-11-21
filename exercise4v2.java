import java.util.Scanner;

public class exercise4v2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("***********INPUT***********");
        System.out.println();

        System.out.println("Enter quantity: ");
        int size = scan.nextInt();

        int num[] = new int[size];

        System.out.print("Enter a number:\t");
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();

        System.out.println();
        System.out.println("***********OUTPUT***********");
        System.out.println();

        System.out.println("Even Elements:\t");
        for (int i = 0; i < size; i++) {
            if((num[i] % 2) ==0)
                System.out.println(num[i]+ ", ");
        }

        System.out.println("Odd Elements:\t");
        for (int i = 0; i < size; i++) {
            if((num[i] % 2) !=0)
                System.out.println(num[i]+ ", ");
        }
    }
}
