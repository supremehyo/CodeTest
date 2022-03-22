class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] copy = absolutes;
        
        for(int i =0 ; i< copy.length ; i++){
            if(signs[i] == false){
                copy[i] = -copy[i];
            }
             answer+= copy[i];
        } 
        return answer;
    }
}