import static org.junit.Assert.*;

/**
 * Created by dellpc on 18/10/2017.
 */
public class VectorHelperTest {
    @org.junit.Test
    public void reverse() throws Exception {
    int testArray[]= new int [6];
        for(int i= 0; i< testArray.length; i++)
        {
            testArray[i]= i;

        }

    int [] expectedArray= {5,4,3,2,1,0} ;
        reverse(testArray);
    }

    @org.junit.Test
    public void minMax() throws Exception {

    }

    @org.junit.Test
    public void doubleArray() throws Exception {

    }

 //--------------------------------------------------
    //Added by Lina

    VectorHelper v = new VectorHelper();
    @org.junit.Test
    public void SommeTest() throws Exception {
        int vect3[] = {1, 2, 3};
        int vect4[] = {4, 8, 2};
        int result1 [] = new int[3];
        int expected[] = {5, 10, 5};

        v.Somme(vect4, vect3, result1);
        assertArrayEquals(expected,result1);


    }

    @org.junit.Test
    public void TriTest() throws Exception {

        int vect1[] = {9, 6, 10, 5, 2};

        int expected[] = {2, 5, 6, 9, 10};

        v.Tri(vect1);
        assertArrayEquals(vect1, expected);



    }

}