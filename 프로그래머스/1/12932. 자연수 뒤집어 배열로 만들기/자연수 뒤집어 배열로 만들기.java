import java.util.Arrays;
import java.util.Collections;


class Solution {
    public int[] solution(long n) {
        // Long 12345 -> String "12345"
        String str = Long.toString(n);
        // String reversed = "54321"
        String reversed = new StringBuilder(str).reverse().toString();
        // char[] arr = ['5','4','3','2','1']
        char[] arr = reversed.toCharArray();
        
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i] - '0';
        }
        return result;
    }
}