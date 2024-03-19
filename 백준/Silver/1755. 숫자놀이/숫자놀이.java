import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line, " ");
        int M = Integer.parseInt(tokenizer.nextToken());
        int N = Integer.parseInt(tokenizer.nextToken());

        List<Integer> numbers = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            numbers.add(i);
        }

        Map<Integer, String> dictionary = new HashMap<>();
        dictionary.put(0, "zero");
        dictionary.put(1, "one");
        dictionary.put(2, "two");
        dictionary.put(3, "three");
        dictionary.put(4, "four");
        dictionary.put(5, "five");
        dictionary.put(6, "six");
        dictionary.put(7, "seven");
        dictionary.put(8, "eight");
        dictionary.put(9, "nine");

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int number : numbers) {
            StringBuilder sb = new StringBuilder();
            String target = String.valueOf(number);

            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                int candidate = Character.getNumericValue(c);

                if (dictionary.containsKey(candidate)) {
                    sb.append(dictionary.get(candidate));
                    if (j < target.length() - 1) {
                        sb.append(" ");
                    }
                }
            }
            treeMap.put(sb.toString(), number);
        }

        int count = 0;
        for (int number : treeMap.values()) {
            System.out.print(number);
            count++;

            if (count % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}