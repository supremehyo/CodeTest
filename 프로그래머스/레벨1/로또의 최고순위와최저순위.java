class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int wincount = 0;
        int zero = 0;
        
        
        int temp = 0;
        int temp2 = 0;
        
        for(int i = 0; i <lottos.length ; i++){
            if(lottos[i] == 0){
                zero++;
            }else{
                for(int j =0; j <win_nums.length ; j++){
                    if(lottos[i] == win_nums[j]){
                        wincount++;
                    }
                }
            }
        }
        
    
        
        switch(wincount +  zero){
            case 6 : temp =1;
                break;
            case 5 : temp =2;
                break;
            case 4 : temp =3;
                break;
            case 3 : temp =4;
                break;
            case 2 : temp =5;
                break;
            default :temp = 6;
                break;
        }
        
        switch(wincount){
            case 6 : temp2 =1;
                break;
            case 5 : temp2 =2;
                break;
            case 4 : temp2 =3;
                break;
            case 3 : temp2 =4;
                break;
            case 2 : temp2 =5;
                break;
            default:  temp2 = 6;
                break;
        }
        
        
        int[] answer = {temp , temp2};
     
        return answer;
    }
}