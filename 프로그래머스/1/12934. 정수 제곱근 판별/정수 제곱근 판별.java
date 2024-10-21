class Solution {
    public long solution(long n) {
        long answer = -1;
        double sqrt = Math.sqrt(n);
        
        if(sqrt%1 == 0){
            long y = (long)sqrt+1;
            answer = y*y;
            
        }
        
        return answer;
    }
}