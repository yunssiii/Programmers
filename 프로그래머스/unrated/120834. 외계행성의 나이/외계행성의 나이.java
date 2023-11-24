class Solution {
    public String solution(int age) {
        String answer = "";
        String alphabet = "abcdefghij";
        String[] agearr = String.valueOf(age).split(""); //age를 띄어쓰기로 나눠서 배열에 저장
        
        for(int i=0;i<agearr.length;i++){
            answer += alphabet.charAt(Integer.valueOf(agearr[i]));
        }
        
        
        return answer;
    }
}