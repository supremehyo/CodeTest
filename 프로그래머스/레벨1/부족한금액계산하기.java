class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long temp = 0; // 수가 커져서 long 으로
        
        for(int i = 1; i<= count ; i++){
            if(price == 1){
                temp += 1;
            }else{
                   temp =  temp +  (price * i);
            }
        }

        if(money < temp) {
            answer = temp - money;
        }else{
            answer = 0;
        }

        return answer;
    }
}