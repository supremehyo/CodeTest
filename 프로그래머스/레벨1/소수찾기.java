class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i =2 ; i<= n ; i++){
            if(checkIsPrimeNumber(i)){
                answer+=1;
            }
        }
        
        return answer;
    }
    
    static boolean checkIsPrimeNumber(int num) {
	for(int i=2 ; i*i<=num; i++) {
		if(num%i ==0) {
			return false; //num이 i의 배수면 소수가 아니므로 false
		}
	}
	return true;
}
}