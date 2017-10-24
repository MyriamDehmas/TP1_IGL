import static org.junit.Assert.*;
import java.util.Arrays;
/**
 * Created by dellpc on 18/10/2017.
 */
   public class VectorHelperTest {
    private VectorHelper vh= new VectorHelper();
    @org.junit.Test
    public void reverseTest() throws Exception {

        int [] enteryVect = { 1,2,3,4,5,6};
        int [] expectedResult = { 6,5,4,3,2,1};
        int [] effectiveResult= vh.reverse(enteryVect);
        if ( !Arrays.equals(expectedResult,effectiveResult) )     { fail("inverse method doesn't work");}

    }

    @org.junit.Test
    public void minMaxTest() throws Exception {

        int [] enteryVect = { 7,-2,3,8,5,1};
        int [] expectedResult = {-2,8};
        int [] effectiveResult= vh.minMax(enteryVect);
        if ( !Arrays.equals(expectedResult,effectiveResult) )     { fail("minMax method doesn't work");}
    }

    @org.junit.Test
    public void doubleArrayTest() throws Exception {

        int [] enteryVect = { 0,1,2,3,4,-20};
        int [] expectedResult = {0,2,4,6,8,-40};
        int [] effectiveResult= vh.doubleArray(enteryVect);
        if ( !Arrays.equals(expectedResult,effectiveResult) )     { fail("doubleArray method doesn't work");}
    }

    //--------------------------------------------------
    //Added by Lina

    @org.junit.Test
    public void SommeTest() throws Exception {
        int vect3[] = {1, 2, 3};
        int vect4[] = {4, 8, 2};
        int result1 [] = new int[3];
        int expected[] = {5, 10, 5};

        vh.Somme(vect4, vect3, result1);
        assertArrayEquals(expected,result1);


    }

    @org.junit.Test
    public void TriTest() throws Exception {

        int vect1[] = {9, 6, 10, 5, 2};

        int expected[] = {2, 5, 6, 9, 10};

        vh.Tri(vect1);
        assertArrayEquals(vect1, expected);



    }

}