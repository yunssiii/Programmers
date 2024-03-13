import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] ch1 = new char[s.length()];
        char[] ch2 = new char[s.length()];
        int i=0;
        int j=0;
        
        for(char ch : s.toCharArray()){
            if(ch>='A' && ch<='Z'){//대문자
                ch1[i] = ch;
                i++;
            }else if(ch>='a' && ch<='z'){//소문자
                ch2[j] = ch;
                j++;
            }
        }
        
        Arrays.sort(ch1, 0, i); //정렬할 때까지 범위 지정 
        Arrays.sort(ch2, 0, j);
        
        // 대문자를 큰 것부터 작은 것 순으로 정렬
        for (int k = 0; k < i / 2; k++) {
            char temp = ch1[k];
            ch1[k] = ch1[i - k - 1];
            ch1[i - k - 1] = temp;
        }

        // 소문자를 큰 것부터 작은 것 순으로 정렬
        for (int k = 0; k < j / 2; k++) {
            char temp = ch2[k];
            ch2[k] = ch2[j - k - 1];
            ch2[j - k - 1] = temp;
        }
        
        answer = new String(ch2,0,j) + new String(ch1,0,i);
        
        return answer;
    }
}