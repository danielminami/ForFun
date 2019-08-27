package forfun.view;

import java.util.Scanner;

/**
 *
 * @author Daniel Minami
 */
public class View {
    
    public View() {}
    
    public void printToConsole(int[] array) {
        for (int i: array){
            System.out.println("Array: ");
            System.out.print(i + "  ");
        }
    }
    
    public void printToConsole(String str) {
        System.out.println(str);
    }
    
    public void printToConsole(String str, double d) {
        System.out.println(String.format("Value of %s is: %f", str, d));
    }
    
    public void printToConsole(String str, int i) {
        System.out.println(String.format("Value of %s is: %d", str, i));
    }
    
    public String getInputString(String msg) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        String input = "";

        do {
            try {
            System.out.println(msg);
            input = scanner.nextLine();
            isValid = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (!isValid);
            
        return input;
    }
    
    public int getInputInt(String msg) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        int input = 0;

        do {
            try {
            System.out.println(msg);
            input = scanner.nextInt();
            isValid = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (!isValid);
            
        return input;
    }    
}
