import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
  ArrayList<Integer> list = new ArrayList<Integer>();
        
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores = {0,0,0}; // 수포자들 답 맞은 개수
        // 비교
        for(int i = 0; i < answers.length; i++){
            if(first[i % 5] == answers[i]){ scores[0]++;}
            if(second[i % 8] == answers[i]){ scores[1]++;}
            if(third[i % 10] == answers[i]){ scores[2]++;}
        }
        
        //
        int[] arr = new int[scores.length];
        for(int i = 0; i < scores.length; i++){
            arr[i] = scores[i];
        }
        
        //가장 많이 맞은 사람이 누군지 알기 위해 정렬
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            //젤 많이 받은 갯수와 scores이 같다는건 i 번째 사람이 젤 많이
            //맞았다는뜻
            if(scores[i] == arr[2]){
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}