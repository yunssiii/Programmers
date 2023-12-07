class Solution {
    public int solution(String s) {
        
        //공백을 기준으로 나눠서 배열에 저장한다.
        //배열의 길이만큼 int로 형변환해 더한다.
        //z가 나오면 그 전 값을 뺀다.
        
        int answer = 0;
        String[] sArray = s.split(" ");
        
        for(int i=0;i<sArray.length;i++){
            if(sArray[i].equals("Z")){
                answer -= Integer.parseInt(sArray[i-1]);
            }else {
                answer += Integer.parseInt(sArray[i]);
            }
        }
        
        return answer;
    }
}