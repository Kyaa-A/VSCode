import java.util.Scanner;

public class advanceexercise2 {

    //Exercise 2 – Advance Search Names in 1D Array – Part 2 

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nameList[]={"Clariedhel","Jayvive","Weelyn","Lorre","Mae Ann","Nelson",
        	"Mervin","Jay","Ryan","Eric","Michael","Joy","Angelo","Marisol","Kent","Vincent"};
        Boolean examine = false;
        String loop = "";

        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT -TVL-B9");
        System.out.println("***********************************************************************");

        do{
            System.out.print("Please enter the Student Name:\t\t");
            String name = scan.nextLine();

            System.out.println("-----------------------------------------------------------------------");
            
            int i;
            for (i = 0; i < nameList.length; i++) {
                if(name.equalsIgnoreCase(nameList[i])){
                    examine = true;
                }
            }
            if(examine == true){
                System.out.print("NAME FOUND, Do you want to Search another name? (Y/N):\t\t");

            }
            else{
                System.out.print("No Name Found, Do you want to Search another name? (Y/N):\t");
            }

            examine = false;
            loop = scan.nextLine();
            System.out.println();

            }
        while(loop.equalsIgnoreCase("Y"));
        System.out.println("SEARCHING STOPPED");  
        scan.close(); 
    }
}
