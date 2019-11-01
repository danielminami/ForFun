package forfun.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daniel Minami
 */
public class FunWithStrings {

    public boolean isAnagram(String str1, String str2) {
        
        Map<String, Integer> letterMap1 = new HashMap<String, Integer>();
        Map<String, Integer> letterMap2 = new HashMap<String, Integer>();
        
        if  (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Error: Arguments cannot "
                    + "be null");
        } else if (str1.length() != str2.length()) {
            return false;
        } else {
            
            for (int i=0; i<str1.length(); i++) {
                
                String s = String.valueOf(str1.charAt(i));
                
                if (letterMap1.containsKey(s)) {
                    letterMap1.replace(s, letterMap1.get(str1.charAt(i)) + 1);
                } else {
                    letterMap1.put(s, 1);
                }
            }
            
            for (int j=0; j<str2.length(); j++) {
                
                String t = String.valueOf(str2.charAt(j));
                
                if (letterMap2.containsKey(t)) {
                    letterMap2.replace(t, letterMap2.get(str2.charAt(j)) + 1);
                } else {
                    letterMap2.put(t, 1);
                }
            }
            
            if (letterMap1.equals(letterMap2)) {
                return true;
            } else {
                return false;
            }
        }
        
    }
    
}
