import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> temp = new ArrayList();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor ==0){
                temp.add(arr[i]);
            }
        }
        Collections.sort(temp);
        
        int[] answer = new int[temp.size()];
                
        if(temp.isEmpty()){
            return new int[] {-1};
        }
        
        for(int i=0;i<temp.size();i++){
            
            answer[i] = temp.get(i);
            
        }
        
        
        return answer;
    }
}
