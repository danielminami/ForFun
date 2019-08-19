package forfun.model;

/**
 *
 * @author Daniel
 */
public class Exponential {
    
    public Exponential () {}
    
    public double calc(double n, double exp) {
        if (exp == 0) {
            return 1;
        } else if (exp > 0) {
            return n * calc(n, exp - 1);
        } else {
            throw new IllegalArgumentException("Negative numbers yet not "
                    + "implemented.");
        }
    }
}
