import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        String temp = (Integer.toString(n,3)).toString();
        StringBuffer sb = new StringBuffer(temp);
        String reversedStr = sb.reverse().toString();

        answer = Integer.parseInt(reversedStr , 3);

        return answer;
    }
}