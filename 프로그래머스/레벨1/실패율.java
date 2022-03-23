//https://sujin-k.tistory.com/61
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        //스테이지 별로 클리어한 사람수를 넣기위한 배열
        //index는 스테이지가 되고 value 는 사람 수가 된다.
        double[] stage = new double[N+1];
       
        for(int i  : stages){
            if(i == N+1){ //스테이지 클리어를 n+1 까지 있을 수 있어서 이 조건을 추가
                continue;
            }
            stage[i]++;
        }
        
        // 실패율을 계산해 담을 list
        ArrayList<Double> fail = new ArrayList<Double>();
        double count = stages.length; //도달한 사람 수
        double temp = 0;
        
        for(int i = 1; i< stage.length ; i++){
            temp = stage[i];//해당 스테이지에 도달한 사람을 temp 에 임시저장
           
            // 스테이지에 도달한 유저가 없는 경우 해당 
            //스테이지의 실패율은 0 으로 정의한다. 조건때문
            if(count == 0){ 
                stage[i] = 0;
            }else{
                //실패율을 계산해서 stage[i]에 저장
                //나중에 내림차순이 된 실패율과 비교하며
                //실패율 순서에 맞는 인덱스(스테이지)를 알아오기 위함.
                stage[i] = stage[i]/count;
                count = count - temp;
            }
            fail.add(stage[i]);
        }
        Collections.sort(fail,Collections.reverseOrder());
        
             //정렬된 fail리스트 값과 stage값을 비교해서 같으면 stage의 인덱스번호(스테이지번호)를 가져옴으로써
     //실패율이 높은 순으로 answer배열에 넣어준다.
     for(int i=0; i<fail.size(); i++){

         for(int j=1; j<stage.length; j++){

             if(fail.get(i) == stage[j]){

                 answer[i] = j;

                 stage[j] = -1;

                 break;

            }

        }

    }
        return answer;
    }
}