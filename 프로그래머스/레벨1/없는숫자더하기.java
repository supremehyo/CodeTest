import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] complete_numbers = {0,1,2,3,4,5,6,7,8,9};
        int[] complete_numbers2 = {0,0,0,0,0,0,0,0,0,0};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
                complete_numbers2[numbers[i]] = numbers[i];
        }
        
        
        for(int i =0; i< complete_numbers.length ; i++){
                if(complete_numbers2[i] != complete_numbers[i]){
                    list.add(i);
                }
        }
        
        for(int i : list){
            answer += i;
        }
        
        
        return answer;
    }
}