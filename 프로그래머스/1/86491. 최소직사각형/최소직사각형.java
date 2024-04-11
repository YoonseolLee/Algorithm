class Solution {
    public int solution(int[][] sizes) {

        // 1. 최대값 저장할 변수 선언 (최대값 비교를 위해 길이의 최소값인 1로 초기화)
        int long_max = 1;
        int short_max = 1;

        /**
         * 입력 받은 sizes 배열의 길이만큼 반복하며 Math.max와 Math.min 함수를 이용하여 각 명함의 길이중 긴 길이와 짧은 길이를 구한다
         * 각 길이의 값이 현재 최대값보다 크다면 최대값을 갱신한다.
         */
        for (int i = 0; i < sizes.length; i++) {
            int longer = Math.max(sizes[i][0], sizes[i][1]);
            int shorter = Math.min(sizes[i][0], sizes[i][1]);

            if (longer > long_max) {
                long_max = longer;
            }

            if (shorter > short_max) {
                short_max = shorter;
            }
        }
        return long_max * short_max;
    }
}

class App {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        sol.solution(sizes);
    }
}