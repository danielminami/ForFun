package forfun.model;

/**
 *
 * @author Daniel
 */
public class Exponential {
    
    public Exponential () {}
    
    public double calc_recursion(double n, double exp) {
        if (exp == 0) {
            return 1;
        } else if (exp > 0) {
            return n * calc(n, exp - 1);
        } else {
            throw new IllegalArgumentException("Negative numbers yet not "
                    + "implemented.");
        }
    }
    
    public double calc(double n, double exp) {
        double res = 0;
        
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return n;
        } else if (exp == -1) {
            return -n;
        } else if (exp > 1) {
            for (int i = 0; i < exp; i++) {
                n += n * n;
            }
            return n;
        } else {
            for (int i = (int)exp; i < 1; i++) {
                n += n / n;
            }
            return n;
        }
    }
    
}
