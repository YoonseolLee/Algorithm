import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(s[i]);
        }

        int count = 0;


        for (int i = 0; i < numbers.length; i++) {
            // 수정된 부분
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == M) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}