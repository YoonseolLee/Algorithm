

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        String[][] array = new String[repeat][3];

        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = st.nextToken(" ");
            array[i][1] = st.nextToken();
            array[i][2] = String.valueOf(i);
        }

        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                // 나이가 같다면 신청 순서에 따라 정렬
                if (Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]) == 0) {
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                } else {
                    // 나이를 정수로 변환하여 비교
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String[] s : array) {
            // String[] 두번째 까지만
            for (int i = 0; i < 2; i++) {
                sb.append(s[i]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}