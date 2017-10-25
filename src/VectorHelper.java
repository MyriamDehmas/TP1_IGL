/**
 * Created by dellpc on 18/10/2017.
 */

/**
 *  A class that permits the following operations on arrays (int []):
 *  reversing the elements of an array,
 *  returning the min and max values of an array,
 *  doubling the value of the elements of an array,
 *  having the sum array of two arrays,
 *  sorting an array,
 */
public class VectorHelper{

        /**
         *
          * @param vector : the int array for which we want to inverse the elements
         * @return the int array inversed
         */
        public int [] reverse(int [] vector)
        {   int tmp;
        for ( int strt= 0, end= vector.length-1; strt<= end; strt++, end--)
        {
        tmp= vector[strt];
        vector[strt]= vector[end];
        vector[end]= tmp;

        }
        return vector;
        }


//--------------------------------

        /**
         *
         * @param vector: the int array for which we want to get the min and max,
         * @return an int[2] array ; array[0] == min,  array[1] == max,
         */
        public int [] minMax(int [] vector)
        {   int [] result = new int[2];

        result[0]= vector[0]; result[1] = vector[0];
        for( int i=1; i<= vector.length-1; i++)
        {
        if (vector[i]< result[0])  result[0] = vector[i];
        if (vector[i]> result[1])  result[1] = vector[i];

        }
        return result;
        }
//--------------------------------

        /**
         *
         * @param vector: the int array we want to double the value of its elements,
         * @return the entry int array with doubled values,
         */
        public int [] doubleArray(int [] vector)
        {
        for( int i=0; i<= vector.length-1; i++)
        {
        vector[i]= vector[i]*2;
        }
        return vector;

        }
//---------------------------------


        /**
         *
         * @param vect1 : the first int array
         * @param vect2 : second int array
         * @param result: the sum int array of the entry ones
         * @throws DifferenceException : throws exeption when the entry arrays are of different lengths,
         */
        public void Somme (int vect1 [], int vect2 [] , int result[]) throws DifferenceException
        {

                int i=0;
                if (vect1.length != vect2.length ) throw new DifferenceException() ;
                else
                {
                        while (i < vect1.length)
                        {
                                result[i] = vect1[i] + vect2[i];
                                i++;
                        }
                }
        }

//________________________________________________________________________

        /**
         *
         * @param vect1: the int array we want to sort increasingly,
         *        the result is returned in the entry array itself,
         */
        public void Tri (int vect1 [] )
        {
                boolean verif = false;
                int sauve;

                while (verif == false)
                {
                        verif = true;
                        for (int i=0 ;i< (vect1.length -1); i++)
                        {

                                if ( vect1[i] > vect1[i+1] )
                                {
                                        sauve = vect1[i];
                                        vect1[i] = vect1[i + 1];
                                        vect1[i + 1] = sauve;
                                        verif = false;

                                }

                        }

                }

        }
        }
