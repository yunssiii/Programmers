class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char c1 = my_string.charAt(num1);
        char c2 = my_string.charAt(num2);
        
        StringBuilder stringBuilder = new StringBuilder(my_string);
        
        stringBuilder.setCharAt(num1,c2);
        stringBuilder.setCharAt(num2,c1);
        
        answer = stringBuilder.toString();
        
        return answer;
    }
}

