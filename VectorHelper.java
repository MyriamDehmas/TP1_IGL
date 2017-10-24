/**
 * Created by dellpc on 18/10/2017.
 */
public class VectorHelper{
//--------------------------------
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
public int [] doubleArray(int [] vector)
        {
        for( int i=0; i<= vector.length-1; i++)
        {
        vector[i]= vector[i]*2;
        }
        return vector;

        }
//---------------------------------
    // Added by Lina

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
