import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        int[] array = new int[repeat];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < repeat; i++) {
            int number = Integer.parseInt(br.readLine());
            array[i] = number;
        }

        Arrays.sort(array);
        for (int i : array) {
            bw.write(String.valueOf(i));
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}