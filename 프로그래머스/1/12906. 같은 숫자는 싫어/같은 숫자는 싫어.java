import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 스택을 사용하여 연속되는 숫자 제거하기
        Stack<Integer> stack = new Stack<>();
        
        // 첫 번째 숫자는 무조건 스택에 추가
        stack.push(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            // 스택의 맨 위 숫자와 현재 숫자를 비교
            if(stack.peek() != arr[i]) {
                // 다르면 스택에 추가
                stack.push(arr[i]);
            }
        }
        
        // 결과를 저장할 배열 생성
        int[] answer = new int[stack.size()];
        
        // 스택의 내용을 배열로 복사
        for(int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }
        
        return answer;
    }
}
