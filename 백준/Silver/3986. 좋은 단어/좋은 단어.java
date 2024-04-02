import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        /**
         *  연속으로 [A,A] 또는 [B,B]가 스택에 들어오면 제거하여 좋은 단어의 카운트를 늘린다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < line.length(); j++) {
                if (stack.size() > 0 && stack.peek() == line.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(line.charAt(j));
                }
            }
            if (stack.size() == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}


