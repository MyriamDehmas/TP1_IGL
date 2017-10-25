/**
 * Created by dellpc on 24/10/2017.
 * this class allows the access to the VectorHelper operations
 */
import java.util.Scanner;
public class Main {



    public static void main( String args[])
    {
        Scanner sc=new Scanner (System.in);  int rep=0, tai;
        int [] array;
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
                    System.out.println("------------------------------------------------" );


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
                    System.out.println("------------------------------------------------" );


                    break;
                case 5:
                    System.out.println(" 5-  Double the elements' value of an array ");
                    System.out.println(" the length of the array :  ");
                    tai = sc.nextInt();
                    array = new int[tai];
                    ArraysInOut.readArray(tai, array);
                    int[] result1 = vectHelp.doubleArray(array);
                    ArraysInOut.printArray(array);
                    System.out.println("------------------------------------------------" );


                    break;




                case 2:

                    System.out.println(" Enter th length of the array 1 :"); tai = sc.nextInt();
                    array = new int[tai];   int [] result2= new int [tai];
                    for (int i=0; i<tai; i++)

                    {
                        System.out.println(" array[" + i + "]");
                        array[i] = sc.nextInt();
                    }

                    System.out.println(" Enter th length of the array 2 :"); tai = sc.nextInt();
                    int [] array2 = new int[tai];
                    for (int i=0; i<tai; i++)

                    {
                        System.out.println(" array2[" + i + "]");
                        array2[i] = sc.nextInt();
                    }
                    try {

                        vectHelp.Somme(array, array2, result2);
                    }
                    catch (DifferenceException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    System.out.println(" Here is the array result :");
                    ArraysInOut.printArray(result2);

                    System.out.println(" The result : ");
                    ArraysInOut.printArray(array);


                    break;


            }
        }




}
