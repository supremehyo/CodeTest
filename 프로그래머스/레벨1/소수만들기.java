class Solution {

    static int count=0;
    static int answer = -1;
    public int solution(int[] nums) {
     
    
        int r = 3;
        combination(nums, new boolean[nums.length], 0, 0, r);
        answer = count;
        return answer;
    }
    
    public static void combination(int[] arr, boolean[] visited, int start, int depth, int r){
        if(depth == r){
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                if(visited[i]){
                    sum += arr[i];
                }
            }
          
            if(checkPrime(sum) == true){
                  System.out.println(sum);
                        count++;
            }
            return;
        }
        for(int i=start; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(arr, visited, i+1, depth+1, r);
                visited[i] = false;
            }
        }
    }

    
    public static boolean checkPrime(int temp){
            for(int i=2; i*i<=temp; i++){
                if(temp % i == 0)  return false;
            }
        return true;
    }
}
//https://velog.io/@cgw0519/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%9C%EC%97%B4-%EC%A4%91%EB%B3%B5%EC%88%9C%EC%97%B4-%EC%A1%B0%ED%95%A9-%EC%A4%91%EB%B3%B5%EC%A1%B0%ED%95%A9-%EC%B4%9D%EC%A0%95%EB%A6%AC  참고