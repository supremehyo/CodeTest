class Solution {
    public int solution(String s) {
        int answer = 0;
        String copy_string = s;
        
        copy_string = copy_string.replace("zero","0");
        copy_string = copy_string.replace("one","1");
        copy_string = copy_string.replace("two","2");
        copy_string = copy_string.replace("three","3");
        copy_string = copy_string.replace("four","4");
        copy_string = copy_string.replace("five","5");
        copy_string = copy_string.replace("six","6");
        copy_string = copy_string.replace("seven","7");
        copy_string = copy_string.replace("eight","8");
        copy_string = copy_string.replace("nine","9");
        

        
        return Integer.parseInt(copy_string);
    }
}