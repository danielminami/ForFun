package forfun.model;

/**
 *
 * @author Daniel Minami
 */
public class SelectionSort extends Sort {
    
    @Override
    public void sort(int[] arr) {
        
        int index = 0;
        int min = 0;
        
        for(int i=0; i<arr.length -1; i++) {
            
            
            //9, 2, 4, 3, 5, 8, 6, 1, 7
            min = arr[i];
            
            
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            
            if (arr[i] > min) {
                arr[index] = arr[i];
                arr[i] = min;
                
            }
        }
    }
}
