import java.io.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {

        /**
         *
         * 1. Arrays.sort() : 평균 O(nlogn) 의 시간복잡도를 보이지만
         * 최악의 경우 O(n2) 로 좋지 않는 성능이 될 수도 있음

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repetition = Integer.parseInt(br.readLine());

        int[] numbers = new int[repetition];

        for (int i = 0; i < repetition; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

         Arrays.sort(numbers);

         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

         for (int n : numbers) {
         bw.write(String.valueOf(n) + "\n") ;
         }

         bw.flush();
         bw.close();
         br.close();

         */

        /**
         * 2. 카운팅 정렬:  시간복잡도는 O(N + K) 이다.
         * K는 자릿수를 의미하는데 입력데이터가 K 보다 훨 씬 큰 경우,
         * 즉 데이터가 많으면 많을 수록 O(N) 에 가깝기 때문에 이상적으로는 O(N) 이라고 보아도 무방하다.
         *
         */
         int[] cnt = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가시킴
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        // 0은 입력범위에 없으므로 1부터 시작
        for (int i = 1; i < 10001; i++) {
            // i 값이 개수가 0이 될 때까지 출력 (빈도수를 의미)
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}