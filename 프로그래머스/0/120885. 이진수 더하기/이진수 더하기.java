class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int num1 = Integer.parseInt(bin1, 2); //2진수 문자열 -> 10진수 정수로 변환
        int num2 = Integer.parseInt(bin2, 2);
        int res = num1+num2; //두 10진수의 합 
        
        answer = Integer.toBinaryString(res); //10진수 -> 2진수 문자열로 변환 
        
        return answer;
    }
}