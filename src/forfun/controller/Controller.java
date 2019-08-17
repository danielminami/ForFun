package forfun.controller;

import forfun.model.Factorial;
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
        view.printToConsole("fatorial of 10", fac.calc(10));

    }
    

    
    
    
}
