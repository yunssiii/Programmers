class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        char[] array = new char[str.length()];
        int[] answer = new int[str.length()];
        int k = 0;
        
        for(int i=array.length;i>0;i--){
            array[k] = str.charAt(i-1);
            answer[k] = array[k]-'0';
            k++;
        }
        
        return answer;
    }
}