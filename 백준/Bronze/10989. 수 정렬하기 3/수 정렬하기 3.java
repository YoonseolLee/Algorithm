import java.io.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repetition = Integer.parseInt(br.readLine());
        int[] numbers = new int[repetition];
        for (int i = 0; i < repetition; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for (int n : numbers) {
            bw.write(String.valueOf(n) + "\n") ;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}