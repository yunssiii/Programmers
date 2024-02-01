class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n);
        
        for(int i=0;i<str.length();i++){
            answer += str.charAt(i) - '0'; // char - '0'은 문자를 정수로 바꿔줌 
        }
        
        return answer;
    }
}