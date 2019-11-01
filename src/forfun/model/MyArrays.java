package forfun.model;

import java.util.List;

/**
 *
 * @author Daniel Minami
 */
public class MyArrays {

    public int findSubstraction(List<Integer> arr, int k) {
        
        int counter = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            
            for (int j = i + 1; j < arr.size(); j++) {
                if ((Math.abs(arr.get(i) - arr.get(j))) == k) {
                    counter++;
                }
            }
            
        }
        
        return counter;
    }
    
    public int[] cleanRepetition(int[] arr) {
        
        int[] cArray = new int[arr.length];
        boolean found = false;
        int indexArray = 0;
        
        //first nested loop
        cArray[indexArray] = arr[0];
        
        for (int i=1; i<arr.length; i++) {
            
            for (int j=0; j<i; j++) {
                if (cArray[j] == arr[i])
                    found = true;
            }
            
            if (!found) {
                indexArray++;
                cArray[indexArray] = arr[i];
                found = false;
            } else {
                found = false;
            }
            
        }
        
        return cArray;
    }
    
}
