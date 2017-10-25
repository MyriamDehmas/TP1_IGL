/**
 * Created by Nae on 23/10/2017.
 * Exception generated in sum method if the two arrays to sum are of different lengths,
 */
public class DifferenceException extends Exception{

    private String message=("Les tailles des deux vecteurs sont différentes, donc l'opération de somme est impossible !");

    @Override
    /**
     * override of the default getMessage ,to print a customized exception message,
     */
    public String getMessage() {
        return this.message;
    }
}
