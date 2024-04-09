import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 1; i < N; i++) {
            int sum = i;
            int temp = i;

            // i의 각 자리수를 sum에 더합니다.
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            // sum이 N과 같다면, i는 N의 생성자입니다.
            if (sum == N) {
                answer = i;
                break; // 가장 작은 생성자를 찾았으므로 반복을 종료합니다.
            }
        }

        System.out.println(answer); // 생성자를 찾지 못하면 0을 출력합니다.
    }
}