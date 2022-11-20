public class exercise2 {
    
    //Exercise 2 ― Reversed Display 
    //Having the same elements from Exercise 1,
    /* create a java program that display the elements in a reverse sequence.  */
    public static void main(String[] args) {
 
    int list[] = {12,23,120,60,320,45,93,21,60,310};
     
    System.out.print("ELEMENTS:\t");

    int i;
    for (i = list.length-1; i>=0 ;i--) {
        System.out.print(list[i]);
        if(i>0){
            System.out.print(",");
        } 
    }
    System.out.println();   
    }
 }
 
 