class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        //문자열은 인덱스를 가지기니까 변수 answer에 length값부터 대입하면 되나?
        for(int i=my_string.length()-1;i>=0;i--){
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}