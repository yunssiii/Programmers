class Solution {
    public String solution(String s) {
        String answer = "";
        
        //단어마다 인덱스 기준 짝-대문자, 홀-소문자 
        
        char[] ch = s.toCharArray();
        int k=0;
        
        for(int i=0;i<ch.length;i++,k++){
            
            if(ch[i]==' '){
                k=-1;
            }
            
            if(k%2==0){
                answer += String.valueOf(Character.toUpperCase(ch[i]));
            }else {
                answer += String.valueOf(Character.toLowerCase(ch[i]));
            }
        }
        return answer;
    }
}