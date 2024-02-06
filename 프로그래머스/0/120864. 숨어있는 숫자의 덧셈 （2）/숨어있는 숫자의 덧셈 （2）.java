class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int temp = 0;
        
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){ //정수인지 확인
                temp = temp * 10 + Character.getNumericValue(c);
            }else {
                answer += temp;
                temp = 0;
            }
        }
        
        answer += temp;
        
        return answer;
    }
}