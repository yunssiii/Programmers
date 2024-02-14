class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean flag = true;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c == '-'){
                flag = false;
            }else if(c != '+'){ //부호가 아닌 숫자라면
                answer = answer * 10 + (c-'0');
            }
        }
        
        answer = flag ? answer : -1 * answer;
        
        return answer;
    }
}