class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strArray = my_string.split(" ");
        
        answer += Integer.parseInt(strArray[0]);
        
        for(int i=1;i<strArray.length-1;i+=2){
            
            if(strArray[i].equals("+")){
                answer += Integer.parseInt(strArray[i+1]);
            }else{
                answer -= Integer.parseInt(strArray[i+1]);
            }
        }
        
        return answer;
    }
}