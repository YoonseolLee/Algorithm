import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repetition = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        
        StringTokenizer st = new StringTokenizer(numbers, " ");

        List<Integer> temp = new ArrayList<>();

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            temp.add(Integer.parseInt(token));
        }

        Set<Integer> set = new HashSet<>();
        for (int number : temp) {
            set.add(number);
        }

        List<Integer> answer = new ArrayList<>();
        
        for (int num : set) {
            answer.add(num);
        }
        Collections.sort(answer);
        

        /**
         * 1. 정수를 출력할 때 write(int c) 사용하면 정수 c를 유니코드 문자로 변환하여 출력한다.
         * 2. 따라서 정수 값을 문자열을 출력할 땐 String.valueOf(num)을 통해 정수를 문자열로 변환한 후 출력해야 함.
         * 3. bw.flush()는 모든 출력 작업이 끝난 후 딱 한번만 호출하는 것이 효율적이다.
         */

//        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
//            for (int num : answer) {
//                bw.write(num);
//                bw.flush();
//            }
//            br.close();
//        }

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            for (int i = 0; i < answer.size(); i++) {
                bw.write(String.valueOf(answer.get(i)));
                if (i < answer.size() - 1) {
                    bw.write(" ");
                }
            }
            bw.flush();
            br.close();
        }
    }
}
