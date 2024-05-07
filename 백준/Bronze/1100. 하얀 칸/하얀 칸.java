import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[][] array = new Character[8][8];
        Character[][] inputArray = new Character[8][8];

        for (int i = 0; i < 8; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                inputArray[i][j] = c;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // 행과 열의 인덱스 합이 짝수인 경우 'W', 홀수면 'B'
                if ((i + j) % 2 == 0) {
                    array[i][j] = 'W';
                } else {
                    array[i][j] = 'B';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (array[i][j].equals('W')) {
                    if (inputArray[i][j].equals('F')) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}