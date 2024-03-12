class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int a = 0; a < numbers.length - 2; a++) {
            for (int s = a + 1; s < numbers.length - 1; s++) { 
                for (int d = s + 1; d < numbers.length; d++) {
                    if (numbers[a] + numbers[s] + numbers[d] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
