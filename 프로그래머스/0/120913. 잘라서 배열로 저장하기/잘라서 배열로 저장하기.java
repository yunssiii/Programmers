class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int arraySize = (len % n == 0) ? len / n : len / n + 1;
        String[] answer = new String[arraySize];
        int k = 0;

        for (int i = 0; i < len; i += n) {
            answer[k] = my_str.substring(i, Math.min(i + n, len));
            k++;
        }

        return answer;
    }
}
