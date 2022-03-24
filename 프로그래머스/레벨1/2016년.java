class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] list = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] list2 = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int currentM = 1;
        int currentD = 1;
        int currentYo = 5; // 금요일
        //currentYo%7 한 숫자로 요일을 알 수 있음.
        
        
        if(a == 1){
           currentYo = currentYo + b -1;
        }else {
            for(int i =0; i< a;i++){
                currentYo = currentYo + list[i];
            }
           currentYo = currentYo - (list[a-1] - b +1);
        }
        System.out.print(currentYo);
        
        answer = list2[(currentYo%7)];
        return answer;
    }
}