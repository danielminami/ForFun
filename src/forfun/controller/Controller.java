package forfun.controller;

import forfun.model.Exponential;
import forfun.model.Factorial;
import forfun.model.Addition;
import forfun.view.View;

/**
 *
 * @author Daniel Minami
 */
public class Controller {
    
    private View view = new View();
    
    public Controller() {}
    
    public void factorial() {
        Factorial fac = new Factorial();
        Exponential exp = new Exponential();
        Addition add = new Addition();
        //view.getUserInput();
        view.printToConsole("fatorial of 4", fac.calc(4));
        view.printToConsole("Exponential of 2 pow 8: ", exp.calc(2, 8));
        view.printToConsole("Addition the given number: ", add.calc(5));

        

    }
    

    
    
    
}
