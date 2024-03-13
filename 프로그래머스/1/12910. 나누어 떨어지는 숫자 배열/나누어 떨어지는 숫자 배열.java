import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int nullCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor != 0) {
                nullCount++;
            }

            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (nullCount == arr.length) {
            list.add(-1);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] += list.get(i);
        }
        // answer = list.toArray();

        Arrays.sort(answer);

        return answer;
    }
}