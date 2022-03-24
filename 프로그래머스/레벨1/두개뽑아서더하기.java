import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] answer = {};
        
        for(int i =0 ;i< numbers.length;i++){

            for(int j =i+1; j< numbers.length ;j++){
               list.add(numbers[i] + numbers[j]);
            }
        }
        
  
        
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : list){
           hashSet.add(i);
        }
        
     
        ArrayList<Integer> list2 = new ArrayList<>(hashSet);
        answer = list2.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}