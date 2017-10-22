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

}