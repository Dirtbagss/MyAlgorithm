class Solution {
    public long[] solution(long n) {
        
        String s =""+n; 
        long[] answer = new long[s.length()];
        
        
        
        int i=0;
        while(n>0){
            answer[i] = n%10;
            n /=10;
            i++;
        }
        
        return answer;
    }
}