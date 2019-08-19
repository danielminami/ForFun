package forfun.model;

/**
 *
 * @author Daniel Minami
 */
public class Addition {
    
    public Addition() {}
    
    public int calc(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calc(n -1);
        }
    }
    
}
