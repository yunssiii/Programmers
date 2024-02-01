class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] temp;
        int su = 0;
        
        for(int i=0;i<quiz.length;i++){
            temp = quiz[i].split(" ");
            
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[2]);
            int z = Integer.parseInt(temp[4]);
            
            if(temp[1].equals("+")){
                su = x+y;
                if(su == z){
                    answer[i] = "O";
                }else {
                    answer[i] = "X"; 
                }
            }else if(temp[1].equals("-")){
                su = x-y;
                if(su == z){
                    answer[i] = "O";
                }else {
                    answer[i] = "X"; 
                }
            }
        }
        return answer;
    }
}