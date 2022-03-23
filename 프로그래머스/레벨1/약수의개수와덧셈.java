class Solution {
    public int solution(int left, int right) {
        int answer = 0;
 
        
        for(int i = left ; i <= right ; i++){
            //개수가 짝수면
            if(function(i)%2 ==0){
                answer = answer + i;
            }
            //개수가 홀수면
            else if(function(i)%2 !=0){
                answer = answer - i;
            }
        }
        return answer;
    }
    
    public int function(int n){
        int cnt =0;
        for (int i = 1; i * i <= n; i++) 
        { 
            if (n % i == 0) {
                cnt++; 
                if (i * i < n) { 
                    cnt++; 
                }
            } 
        }
        return cnt;
    }
    
}