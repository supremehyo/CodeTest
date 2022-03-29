class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i = 1 ; i <= s.length()/2;i ++ ){
            int zipLevel = 1; 
            String st = s.substring(0,i); // 압축할 문자
            StringBuilder result = new StringBuilder(); //압축완료한 문자를 저장할 StringBuilder
            
            for(int j = i ; j<= s.length() ; j+=i){
                // 다음 문자 추출
                String next = s.substring(j , j+i > s.length() ? s.length() : j+i);
                if(st.equals(next)) zipLevel++;
                else{
                    result.append((zipLevel != 1 ? zipLevel : "") + st);
                    st = next; // 다음 문자를 압축할 문자로 지정 
                    zipLevel = 1;
                }
            }
          result.append(st); // 마지막에 추가안된 zipStr추가 
        answer = Math.min(answer, result.length()); // 가장 작은 문자열 길이 저장


        }
            
        
        
        
        return answer;
    }
}