class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num = 0;
        int num2 = 0;
        
        String[] strArray = polynomial.split(" ");
        
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].contains("x")){ //일차항
                char[] charArray = strArray[i].toCharArray();
                
                if(charArray.length == 1){
                    num += 1;
                }else {
                    num += Integer.parseInt(strArray[i].replace("x", ""));
                }
            }else { //상수항
                if(!strArray[i].equals("+")){
                    num2 += Integer.parseInt(strArray[i]);
                }
            }
        }
        
        if(num == 0){
            answer = num2 + "";
        }else if(num == 1 && num2 == 0){
            answer = "x";
        }else if(num == 1 && num2 != 0){
            answer = "x + " + num2;
        }else if(num2 == 0 && num != 1){
            answer = num + "x";
        }else if(num == 0 && num2 == 0) {
            answer = "0";
        }else if(num != 1 && num2 != 0){
            answer = num + "x + " + num2;
        }
        
        return answer;
    }
}