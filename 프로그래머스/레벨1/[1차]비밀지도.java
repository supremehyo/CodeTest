import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
      
        String [][] map = new String [n][n];
        
        for(int i =0; i < arr1.length;i++){
            //2진수로 변환
            String a2 = Integer.toBinaryString(arr1[i]);
            //한변 길이랑 2진수랑 길이를 맞춰야한다.
            while(a2.length() != n){
                a2 = "0"+a2;
            }
            for(int j =0 ;j< arr1.length; j++){
                 if(a2.charAt(j) == '0'){
                     map[i][j] = " ";
                 }else if (a2.charAt(j) == '1'){
                     map[i][j] = "#";
                 }
            }
        }

        for(int i =0; i < arr2.length;i++){
            //2진수로 변환
            String a2 = Integer.toBinaryString(arr2[i]);
            //한변 길이랑 2진수랑 길이를 맞춰야한다.
            while(a2.length() != n){
                a2 = "0"+a2;
            }
      
            for(int j =0 ;j< arr2.length; j++){
                if(map[i][j] != "#"){
                    if(a2.charAt(j)  == '0'){
                        map[i][j] = " ";
                    }else if (a2.charAt(j)  == '1'){
                        map[i][j] = "#";
                    }
                }
            }
        }
        
       String[] answer = new String [n];
        
        for(int i =0; i < arr2.length;i++){
            String temp = "";
            for(int j =0 ;j< arr2.length; j++){
                temp += map[i][j];
            }
               answer[i] = temp;
        }
 
        

 
        return answer;
    }
}