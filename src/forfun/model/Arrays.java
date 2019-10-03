package forfun.model;

import java.util.List;

/**
 *
 * @author Daniel Minami
 */
public class Arrays {

    public int findSubstraction(List<Integer> arr, int k) {
        
        int counter = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            
            for (int j = i + 1; j < arr.size(); j++) {
                if ((Math.abs(arr.get(i)) - Math.abs(arr.get(j))) == k) {
                    counter++;
                }
            }
            
        }
        
        return counter;
    }
    
}
