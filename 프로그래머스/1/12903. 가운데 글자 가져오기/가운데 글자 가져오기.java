class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        int x = str.length;
        if(x%2 ==0){
            answer = str[x/2-1]+str[x/2]; 
        }else{
            answer = str[x/2];
        }
        
        
        
        return answer;
    }
}