package forfun.model;

/**
 *
 * @author Daniel Minami
 */
public class SelectionSort extends Sort {
    
    @Override
    public void sort(int[] arr) {
        
        int currentPos = 0;
        int old = 0;
        int min = 0;
        
        for(int i=0; i<arr.length -1; i++) {
            
            currentPos = arr[i];
            
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < currentPos){
                    min = arr[j];
                    old = j;
                }
            }
            
            if (arr[i] > min) {
                arr[i] = min;
                arr[old] = currentPos;
            }
        }
    }
}
