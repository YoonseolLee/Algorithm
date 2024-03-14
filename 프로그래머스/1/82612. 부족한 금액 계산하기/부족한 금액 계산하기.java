class Solution {
    public long solution(int price, int money, int count) {
        long[] array = new long[count];
        for (int i = 0; i < count; i++) {
           array[i] += price * (i+1);
        }

        long sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        long answer = 0;

        answer = sum - money;

        if (answer > 0) {
            return answer;
        } else {
            return 0;
        }
    }
}