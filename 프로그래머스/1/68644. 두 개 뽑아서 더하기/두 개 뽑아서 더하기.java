import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {
        int sum; 
        List<Integer> sumList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j <numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                
                if (sumList.contains(sum)) {
                    continue;    
                } else {
                    sumList.add(sum);
                    answerList.add(sum);
                }
            }   
        }
        Collections.sort(answerList);
        return answerList;
    }
}