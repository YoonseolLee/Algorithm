import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /**
         *
         * 24시간동안
         * aSum이 현재 피로도이다. a를 더해도 m 이하라면, 무조건 일을 한다.
         * 피로도는 a만큼 증가한다. 
         *
         * 일을 하면 피로도가 m을 넘을 경우, 무조건 휴식한다.
         * 주의) 현재 피로도가 음수라면 0으로 수정한다.
         */
        

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int sum = 0;
        int aSum = 0;

        for (int i = 0; i < 24; i++) {
            if (aSum + a <= m) {
                sum += b;
                aSum += a;
            } else {
                aSum -= c;
                if (aSum < 0) {
                    aSum = 0;
                }
            }
        }
        System.out.println(sum);
    }
}