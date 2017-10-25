/**
 * Created by dellpc on 24/10/2017.
 * this class allows the access to the VectorHelper operations
 */
import java.util.Scanner;
public class Main {



    public static void main( String args[])
    {
        Scanner sc=new Scanner (System.in);  int rep=0, tai;
        int [] array; int yes = 1;
        VectorHelper vectHelp = new VectorHelper ();

        System.out.println("------------  Available operations  ------------" );
        System.out.println();
        System.out.println(" 1-  Sort the elements of an array ");
        System.out.println(" 2-  Sum two arrays ");
        System.out.println(" 3-  Reverse an array ");
        System.out.println(" 4-  Get the Min and Max values of an array ");
        System.out.println(" 5-  Double the elements' value of an array ");
        System.out.println("------------------------------------------------" );

        System.out.println(" Enter the operation number :" );  rep=sc.nextInt();
        while( yes) {
            switch (rep) {
                case 1:
                    System.out.println(" 1-  Sort the elements of an array ");
                    System.out.println(" the length of the array :  ");
                    tai = sc.nextInt();
                    array = new int[tai];
                    ArraysInOut.readArray(tai, array);
                    vectHelp.Tri(array);
                    System.out.println(" The result : ");
                    ArraysInOut.printArray(array);


                    break;
                case 3:
                    System.out.println(" 3-  Reverse an array ");
                    System.out.println(" the length of the array :  ");
                    tai = sc.nextInt();
                    array = new int[tai];
                    ArraysInOut.readArray(tai, array);
                    vectHelp.reverse(array);
                    System.out.println("The result : ");
                    ArraysInOut.printArray(array);

                    break;
                case 4:
                    System.out.println(" 4-  Get the Min and Max values of an array ");
                    System.out.println(" the length of the array :  ");
                    tai = sc.nextInt();
                    array = new int[tai];
                    ArraysInOut.readArray(tai, array);
                    int[] result = vectHelp.minMax(array);
                    System.out.println(" Min Value : " + result[0] + " Max Value :" + result[1]);


                    break;
                case 5:
                    System.out.println(" 5-  Double the elements' value of an array ");
                    System.out.println(" the length of the array :  ");
                    tai = sc.nextInt();
                    array = new int[tai];
                    ArraysInOut.readArray(tai, array);
                    int[] result1 = vectHelp.doubleArray(array);
                    ArraysInOut.printArray(array);


                    break;




                case 2:

                    System.out.println(" Enter th length of the array 1 :"); tai = sc.NextInt();
                    array = new int[tai];
                    for (int i=0; i<tai; i++)

                    {
                        System.out.println(" array[" + i + "]");
                        array[i] = sc.NextInt();
                    }

                    System.out.println(" Enter th length of the array 2 :"); tai = sc.NextInt();
                    array2 = new int[tai];
                    for (int i=0; i<tai; i++)

                    {
                        System.out.println(" array2[" + i + "]");
                        array2[i] = sc.NextInt();
                    }
                   int result [tai]= vectHelp.Somme(array , array2);
                    System.out.println(" Here is the array result :");
                    for (int i=0; i<tai ; i++)
                    {
                        System.out.println(" array[" +i +"] =" + result[i]);
                    }

                    break;


            }
        }


    }

}
