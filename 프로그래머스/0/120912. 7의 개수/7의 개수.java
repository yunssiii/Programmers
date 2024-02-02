class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] newArray;
        
        for(int i=0;i<array.length;i++){
            newArray = String.valueOf(array[i]).split("");
            
            for(int j=0;j<newArray.length;j++){
                if(newArray[j].equals("7")){
                    answer ++;
                }
            }
        }
        
        return answer;
    }
}