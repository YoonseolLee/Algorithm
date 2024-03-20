import java.io.*;

class Main {
    static long[] fibonacciCache;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fibonacciCache = new long[n+1];
        long result = fibonacci(n);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    // 1. 재귀 함수 구현
    /*
    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        } else {
            long fibonacciResult = fibonacci(n - 1) + fibonacci(n - 2);
            fibonacciCache[n] = fibonacciResult;
            return fibonacciResult;
        }
    }
    */
    
    // 2. 반복문
    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
            // base case
        }

        fibonacciCache[0] = 0;
        fibonacciCache[1] = 1;

        /**
         * fibonacciCache[0],[1]은 이미 값이 있기 때문에 [2]부터 n까지 계산한다.
         * Example) n = 4인경우, 
         * 1. fibonacciCache[2] = fibonacciCache[1] + fibonacciCache[0] = 1 + 0 = 1
         * 2. fibonacciCache[3] = fibonacciCache[2] + fibonacciCache[1] = 1 + 1 = 2
         * 3. fibonacciCache[4] = fibonacciCache[3] + fibonacciCache[2] = 2 + 1 = 3
         * 결과는 3이다. 
         */
        for (int i = 2; i <= n; i++) {
            fibonacciCache[i] = fibonacciCache[i-1] + fibonacciCache[i-2];
        }
        return fibonacciCache[n];
        // recursive case
    }
}




