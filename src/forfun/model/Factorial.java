package forfun.model;

/**
 * This class models a Factorial number
 * 
 * @author Daniel Minami
 */
public class Factorial {
    
    public Factorial() {}
    
    public double calc(int factor) {
        
        if (factor == 0) {
            return 1;
        } else {
            return factor * (calc(factor -1));
        }
        
    }
    
}