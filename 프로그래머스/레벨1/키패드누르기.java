class Solution {
            int [][] board = { {0,0},{0,1},{0,2}, 
                           {1,0},{1,1},{1,2},
                           {2,0},{2,1},{2,2},
                           {3,0},{3,1},{3,2}};
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftpos = 10;
        int rightpos = 12;
        
    
        for(int number : numbers){
            //왼손
            if(number == 1 || number == 4 || number == 7){
                answer+="L";
                leftpos = number;
            }
            //오른손
            else if(number == 3 || number == 6 || number == 9){
                  answer+="R";
                  rightpos = number;
            }
            //거리 계산 필요
            else{
                if(number == 0) number = 11;
                
                int leftdis = getDistance(number , leftpos);
                int rightdis = getDistance(number, rightpos);
                
                if(leftdis >rightdis){
                    answer += "R";
                    rightpos = number;
                }else if(leftdis <rightdis){
                    answer += "L";
                    leftpos = number;
                }else{
                    if(hand.equals("right")){
                         answer += "R";
                         rightpos = number;
                    }else{
                         answer += "L";
                        leftpos = number;
                    }
                }
            }
        }
        
    
        return answer;
    }
    
    public int getDistance(int number , int pos){
        int xx = Math.abs((board[pos -1][0])-(board[number -1][0]));
        int yy = Math.abs((board[pos -1][1])-(board[number -1][1]));
        return xx+ yy;
    }
}