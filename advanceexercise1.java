import java.util.Scanner;

public class advanceexercise1 {

    //Exercise 1 – Search Names in 1D Array – Part 1
    /*Create a java program that can search a name of the students in the following list below: */

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nameList[]={"Clariedhel","Jayvive","Weelyn","Lorre","Mae Ann","Nelson",
        	"Mervin","Jay","Ryan","Eric","Michael","Joy","Angelo","Marisol","Kent","Vincent"};
        Boolean examine = false;

        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT -TVL-B9");
        System.out.println("***********************************************************************");
        System.out.print("Please enter the Student Name:\t\t");
        String name = scan.nextLine();

        scan.close();

        System.out.println("-----------------------------------------------------------------------");
        int i;
        for (i = 0; i < nameList.length; i++) {
            if(name.equals(nameList[i])){
                examine = true;
            }
        }
        if(examine == true){
            System.out.println("Name Found: "+ name);
        }
        else{
            System.out.println("No Name Found");
        }
    }
}
