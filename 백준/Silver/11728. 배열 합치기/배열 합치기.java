
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    private static int aLen;
    private static int bLen;
    private static int[] A;
    private static int[] B;
    private static int[] C;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. aLen, bLen 입력
        aLen = Integer.parseInt(st.nextToken());
        bLen = Integer.parseInt(st.nextToken());

        A = new int[aLen];
        B = new int[bLen];

        // 2. 배열 A 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aLen; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 3. 배열 B 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bLen; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        // 4. 배열 합치기
        C = new int[aLen + bLen];
        int idx = 0;

        for (int num : A) {
            C[idx++] = num;
        }

        for (int num : B) {
            C[idx++] = num;
        }

        // 5. 오름차순 정렬
        Arrays.sort(C);

        // 6. 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < C.length; i++) {
            sb.append(C[i]);
            if (i != C.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
