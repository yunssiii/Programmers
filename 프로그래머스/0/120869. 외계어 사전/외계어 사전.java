class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        boolean allFlag = true;
        
        for(int i=0;i<dic.length;i++){
            for(int j=0;j<spell.length;j++){
                if(!dic[i].contains(spell[j])){
                    allFlag = false;
                   break;
                }else {
                    dic[i] = dic[i].replace(spell[j],"");
                    allFlag = true;
                }
            }
            
            if(allFlag && dic[i].isEmpty()){
                answer = 1;
            }
        }
        
        return answer;
    }
}