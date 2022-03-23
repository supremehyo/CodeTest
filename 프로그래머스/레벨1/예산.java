import java.util.*;
//작은 수 부터 더하기 시작하면 최대한 많은 부서를
//지원할수 있는 경우가 얼마인지 구하기가 쉬워짐.
//정렬부터 하고 진행하면 수월
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum =0;
    
       for(int i =0; i< d.length ; i++){
            sum+= d[i];
           if(sum> budget){
               answer = i;
               break;
           }
        }
        
        if(sum <= budget){
           answer = d.length;
        }
        return answer;
    }

}