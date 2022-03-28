import java.util.Arrays;
import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] st = new String[s.length()];
        
        for(int i =0; i< s.length() ;i++){
            st[i] = String.valueOf(s.charAt(i));
           
        }
        Arrays.sort(st, Collections.reverseOrder());
        for(int i =0; i< s.length() ;i++){
           answer += st[i];
        }
        
        
        return answer;
    }
}