class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String c1 = my_string.substring(num1, num1 + 1); //substring으로 해당 문자 구하기
        String c2 = my_string.substring(num2, num2 + 1);

        StringBuilder stringBuilder = new StringBuilder(my_string); //가변을 위해 StringBuilder 사용

        stringBuilder.replace(num1, num1 + 1, c2); //num1 인덱스 자리 문자를 c2로 바꾸기
        stringBuilder.replace(num2, num2 + 1, c1);

        answer = stringBuilder.toString();
        
        return answer;
    }
}