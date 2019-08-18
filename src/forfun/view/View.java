package forfun.view;

/**
 *
 * @author Daniel Minami
 */
public class View {
    
    public View() {}
    
    public void printToConsole(String str) {
        System.out.println(str);
    }
    
    public void printToConsole(String str, double d) {
        System.out.println(String.format("Value of %s is: %f", str, d));
    }
    
    public void printToConsole(String str, int i) {
        System.out.println(String.format("Value of %s is: %d", str, i));
    }
}
