import java.util.Scanner;
/**
 * Created by dellpc on 24/10/2017.
 * contains the static methods for reading and displaying arrays
 */
public class ArraysInOut {
    /**
     * read the values of an int array
     * @param tai: an int for the length of the array to read
     */
    static void readArray(int tai,int []array){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<tai; i++)
        {   System.out.print(" array[" +i+ "]  :");
            array[i]= sc.nextInt();
        }
        printArray(array);
    }

    /**
     * prints the content of an array
     * @param array: int array to display,
     */
    static void printArray(int []array){

        for (int i=0; i<array.length;i++)
        {   System.out.print(array[i]+"  ");
        }
        System.out.println();
    }
}
