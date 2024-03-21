import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean solution(int x) {

        String strX = String.valueOf(x);
        List<Integer> list = new ArrayList<>();
        boolean answer = true;

        for (int i = 0; i < strX.length(); i++) {
            char c = strX.charAt(i);
            int numericValue = Character.getNumericValue(c);
            list.add(numericValue);
        }

        int sum = 0;
        for (int i : list) {
             sum += i;
        }

        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}