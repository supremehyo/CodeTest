import java.util.*;

class Solution {
    
    public int[] solution(String[] id_list, String[] report, int k) {
      report = Arrays.stream(report).distinct().toArray(String[]::new);

		Map<String, Integer> result = new LinkedHashMap();
		Map<String, ArrayList<String>> reportMap = new HashMap<>();
        
        for(int i =0; i< id_list.length; i++){
            result.put(id_list[i] , 0);
        }
        
        for(int i =0 ; i< report.length ; i++){
            String[] arryReport = report[i].split(" ");
            String reporter = arryReport[0];
            String target = arryReport[1];
            
            if(reportMap.containsKey(target)){
                reportMap.get(target).add(reporter);
            }else{
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(reporter);
                reportMap.put(target ,temp );
            }
        }
        
        for(String temp : reportMap.keySet()){
            if(reportMap.get(temp).size() >= k){
                //reportMap의 value 로 가지는 string list의 원소를 i로 받아오는것
                for(String i : reportMap.get(temp)){
                    result.put(i , result.getOrDefault(i , 0) +1);
                }
            }
        }
        

	
		return result.values().stream().mapToInt(Integer::intValue).toArray();
    
    }
}