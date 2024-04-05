
import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new ArrayDeque();
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            queue.offerFirst(i);
        }

        // [7,6,5,4,3,2,1]
        while (queue.size() > 0) {
            for (int i = 1; i < K; i++) { // k가 3이면 2번만 옮김
                int a = queue.pollLast();
                queue.offerFirst(a);
            }
            int b = queue.pollLast();
            answer.add(b);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < answer.size(); i++) {
            if (i == answer.size() - 1) {
                sb.append(answer.get(i));
            } else {
                sb.append(answer.get(i)).append(", ");
            }
        }
        sb.append(">");

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}