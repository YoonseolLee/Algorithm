import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nCount;
        int mCount;
        int[] answer;

        nCount = Integer.parseInt(br.readLine());
        int[] nArray = new int[nCount];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nCount; i++) {
            if (st.hasMoreTokens()) {
                nArray[i] = Integer.parseInt(st.nextToken());
            }
        }

        mCount = Integer.parseInt(br.readLine());
        int[] mArray = new int[mCount];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < mCount; i++) {
            if (st2.hasMoreTokens()) {
                mArray[i] = Integer.parseInt(st2.nextToken());
            }
        }

        answer = calc(nArray, mArray);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    static int[] calc(int[] nArray, int[] mArray) {
        int lo, hi, mid, target;
        int[] answer = new int[mArray.length];

        Arrays.sort(nArray);

        for (int i = 0; i < mArray.length; i++) {
            lo = 0;
            hi = nArray.length - 1;
            target = mArray[i];

            boolean found = false;
            while (lo <= hi) {
                mid = (lo + hi) / 2;
                if (nArray[mid] == target) {
                    answer[i] = 1;
                    found = true;
                    break;
                }
                if (nArray[mid] < target) {
                    lo = mid + 1;
                }
                if (nArray[mid] > target) {
                    hi = mid - 1;
                }
            }
            if (!found) {
                answer[i] = 0;
            }
        }
        return answer;
    }
}
