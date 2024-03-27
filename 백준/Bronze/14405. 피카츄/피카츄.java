import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String s = input.replaceAll("pi|ka|chu", "");

        if (s.equals("")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        /**
         * 오답!!!!!!!! ex. pipin -> YES 출력
        if (input.contains("pi") || input.contains("ka") || input.contains("chu") || input.) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
         */
    }
}