import java.io.*;

public class Main {
    static int width;
    static int height;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] chessSize = br.readLine().split(" ");
        width = Integer.parseInt(chessSize[0]);
        height = Integer.parseInt(chessSize[1]);

        char[][] board = new char[width][height];

        for (int i = 0; i < width; i++) {
            String input = br.readLine();
            for (int j = 0; j < height; j++) {
                board[i][j] = input.charAt(j);
            }
        }

        int minRepaints = Integer.MAX_VALUE;
        for (int i = 0; i <= width - 8; i++) {
            for (int j = 0; j <= height - 8; j++) {
                minRepaints = Math.min(minRepaints, calc(board, i, j));
            }
        }

        System.out.println(minRepaints);
    }

    static int calc(char[][] board, int x, int y) {
        int endX = x + 8;
        int endY = y + 8;
        int repaints1 = 0; // 맨 왼쪽 위 칸이 흰색인 경우
        int repaints2 = 0; // 맨 왼쪽 위 칸이 검은색인 경우

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') repaints1++;
                    if (board[i][j] != 'B') repaints2++;
                } else {
                    if (board[i][j] != 'B') repaints1++;
                    if (board[i][j] != 'W') repaints2++;
                }
            }
        }

        return Math.min(repaints1, repaints2);
    }
}
