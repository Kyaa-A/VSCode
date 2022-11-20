public class exercise1 {

    //Exercise 1 ― Sum of an Initialized Elements
    /* Given an array of integer with a length of 10,
    create a java program that display all the elements and the sum of all the elements. 
    The elements are: 12,23,120, 60, 320, 45, 93,21,60,310 */

    public static void main(String[] args) {
        
        int list[]={12,23,120,60,320,45,93,21,60,310};
        int sum = 0;

        System.out.print("ELEMENTS: ");

        int i;
        for (i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if(i<(list.length-1)){
                System.out.print(", ");
            }
            int elements = list[i];
            sum += elements;
        }     
        System.out.println();
        System.out.println("SUM:      " + sum);
    }   
}