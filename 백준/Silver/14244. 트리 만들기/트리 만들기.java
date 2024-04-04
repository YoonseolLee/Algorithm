import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        // 입력 스트림 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 스트림 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 값을 공백으로 구분하여 n과 m에 할당
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 노드 개수
        int m = Integer.parseInt(input[1]); // 리프 개수

        // 트리 생성을 위한 변수 초기화
        int[] parent = new int[n]; // 각 노드의 부모 노드 인덱스를 저장할 배열
        int currentNode = 0; // 현재 노드 인덱스
        int count = m - 1; // 리프 개수에서 1을 뺀 값

        // 트리 생성
        for (int i = 1; i < n; i++) {
            if (m == 2) { // 리프가 2개일 경우
                bw.write(currentNode + " " + i + "\n"); // 현재 노드와 다음 노드 연결
                currentNode++; // 현재 노드 인덱스 증가
            } else {
                bw.write(currentNode + " " + i + "\n"); // 현재 노드와 다음 노드 연결
                parent[i] = currentNode; // 다음 노드의 부모 노드 인덱스 설정
                currentNode++; // 현재 노드 인덱스 증가
                if (count > 0) { // 리프 개수에서 1을 뺀 값이 0보다 클 경우
                    currentNode--; // 현재 노드 인덱스 감소
                    count--; // 카운트 감소
                }
            }
        }

        // 출력 스트림 종료
        bw.flush();
        bw.close();
        br.close();
    }
}