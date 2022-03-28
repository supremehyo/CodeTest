import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i : arr){
            if(i % divisor ==0){
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }

        return  answer;
    
    }
}