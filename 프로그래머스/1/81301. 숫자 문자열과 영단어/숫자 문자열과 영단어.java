import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int solution(String str) {

        Map<String, Integer> wordToNumber = new HashMap<>();
        wordToNumber.put("zero", 0);
        wordToNumber.put("one", 1);
        wordToNumber.put("two", 2);
        wordToNumber.put("three", 3);
        wordToNumber.put("four", 4);
        wordToNumber.put("five", 5);
        wordToNumber.put("six", 6);
        wordToNumber.put("seven", 7);
        wordToNumber.put("eight", 8);
        wordToNumber.put("nine", 9);


        ///////////////////////////////

        StringBuilder tempWord = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            // 숫자인 경우: result에 추가
            if (Character.isDigit(c)) {
                result.append(c);
            }
            // 알파벳인 경우: tempWord에 추가
            if (Character.isLetter(c)) {
                tempWord.append(c);

                // 영단어에 해당하면 result에 추가
                if (wordToNumber.containsKey(tempWord.toString())) {
                    result.append(wordToNumber.get(tempWord.toString()));
                    tempWord.setLength(0); // StringBuilder 초기화
                }
            }
        }
        return Integer.parseInt(result.toString());
    }
}