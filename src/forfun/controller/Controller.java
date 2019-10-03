package forfun.controller;

import forfun.model.Exponential;
import forfun.model.Factorial;
import forfun.model.Addition;
import forfun.model.SelectionSort;
import forfun.view.View;

/**
 *
 * @author Daniel Minami
 */
public class Controller {
    
    private View view = new View();
    
    public Controller() {}
    
    public void sort() {
        SelectionSort sSort = new SelectionSort();
        int[] arrayToSort = {9, 2, 4, 3, 5, 8, 6, 1, 7};
        sSort.sort2(arrayToSort);
        view.printToConsole(arrayToSort);
    }
    
    public void recursion() {
        Factorial fac = new Factorial();
        Exponential exp = new Exponential();
        Addition add = new Addition();
        //view.getUserInput();
        int facNum = view.getInputInt("Please enter a integer number "
                + "to calculate the fatorial.");
        view.printToConsole("fatorial of 4", fac.calc(facNum));
        view.printToConsole("Exponential of 2 pow 8: ", exp.calc_recursion(2, 8));
        view.printToConsole("Addition the given number: ", add.calc(5));


    }
    
    public void calculation() {
        Exponential exp = new Exponential();
        view.printToConsole("Exponential of 2 pow 8: ", exp.calc(2, 8));
        view.printToConsole("Exponential of 2 pow 5: ", exp.calc(2, 5));
        view.printToConsole("Exponential of 2 pow -4: ", exp.calc(2, -4));
    }
    

    
    
    
}
