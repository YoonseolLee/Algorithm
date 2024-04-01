import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repetition = Integer.parseInt(br.readLine());

        PriorityQueue<Double> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < repetition; i++) {
            double score = Double.parseDouble(br.readLine());

            //힙에 성적 추가
            minHeap.add(score);

            // 힙의 크기가 8이 되면 가장 높은 성적을 가진 학생 제거
            if (minHeap.size() > 7) {
                minHeap.poll();
            }
        }

        // 결과 출력을 위해 힙을 배열로 변환
        Double[] result = minHeap.toArray(new Double[0]);
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(result);

        // 하위 7명의 성적 출력
        for (double score : result) {
            System.out.printf("%.3f\n", score);
        }

        br.close();
    }
}


