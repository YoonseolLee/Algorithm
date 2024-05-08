import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarves = new int[9];
        int totalHeight = 0;

        for (int i = 0; i < 9; i++) {
            dwarves[i] = Integer.parseInt(br.readLine());
            totalHeight += dwarves[i];
        }

        Arrays.sort(dwarves);  // 난쟁이 키를 오름차순으로 정렬

        // 두 난쟁이를 찾는 과정
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                // 두 난쟁이를 제외한 키의 합이 100이 되는 경우
                if (totalHeight - dwarves[i] - dwarves[j] == 100) {
                    // 해당 난쟁이를 제외하고 출력
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) {
                            continue; // 제외되는 난쟁이는 출력하지 않음
                        }
                        System.out.println(dwarves[k]);
                    }
                    return; // 일곱 난쟁이를 찾았으므로 프로그램 종료
                }
            }
        }
    }
}