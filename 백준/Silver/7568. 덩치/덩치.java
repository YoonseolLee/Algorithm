import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 오타 수정됨

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int [N][2];

        String[] sp;
        for(int i=0; i<N; i++) {
            sp = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(sp[0]);
            arr[i][1] = Integer.parseInt(sp[1]);
        }

        for (int i = 0; i <N; i++) {
            int rank = 1;

            for (int j = 0; j < N; j++) {
                // 같은 사람은 비교할 필요 없음
                if (i == j) continue;

                /**
                 * i번째 사람과 j번째 사람을 비교하여
                 * i가 j보다 덩치가 작으면 rank를 1 증가시킨다.
                 */

                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
