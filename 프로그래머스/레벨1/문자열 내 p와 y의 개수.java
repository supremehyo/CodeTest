class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int c = 0;
        int c2 =0 ;
        
        for(int i =0 ;i< s.length() ; i++){
            if(s.toLowerCase().charAt(i) == 'p'){
                c++;
            }else if(s.toLowerCase().charAt(i) == 'y'){
                c2++;
            }
        }
        
        if(c != c2){
            answer = false;
        }
        if(c==0 && c2 ==0){
              answer = true;
        }
        
        return answer;
    }
}