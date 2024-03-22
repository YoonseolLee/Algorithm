
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> answerContainer = new ArrayList<>();

        while (true) {
            int repetition = Integer.parseInt(br.readLine());
            if (repetition == 0) break;

            // 각 테스트 케이스마다 새로운 리스트를 생성
            List<String> words = new ArrayList<>();
            for (int i = 0; i < repetition; i++) {
                String word = br.readLine();
                words.add(word);
            }

            List<String> result = function(words); // 중복된 호출 제거
            answerContainer.add(result.get(0));
        }
        for (String s : answerContainer) {
            System.out.println(s);
        }
    }

    public static List<String> function(List<String> words) {
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 1. toLowerCase를 변수에 담지 않으면 소용없음
//                for (String word : words) {
//                    word.toLowerCase();
//                }
//                return o1.compareTo(o2);

                // 2. String에도 toLowerCase 적용 가능
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });
        return words;
    }
}
