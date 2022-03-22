import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length / 2;

        // 중복제거는 set을 쓰자.
        HashSet<Integer> numset = new HashSet<>();

        for (int num : nums) {
            numset.add(num);
        }
        // 중복을 제거한 셋의 크기가 max보다 크면 max를, 작으면 numsSet의 size를 리턴
        if (numset.size() > count) {
            answer = count;
        } else {
            answer = numset.size();
        }
        return answer;
    }
}