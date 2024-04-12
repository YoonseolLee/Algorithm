import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        while (count != N) {
            num++;

            // 666을 포함하는 숫자인지 검사한다.
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}