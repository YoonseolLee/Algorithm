import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // 1. while문 사용
        while (queue.size() > 1) {
            queue.remove();
            int downNumber = queue.poll();
            queue.add(downNumber);
        }

        /** 2. for문 사용
        for (int i = 0; i < n - 1; i++) { // 마지막 1개가 남을 때까지 반복하므로 n-1이다.
            queue.remove();
            int donwNumber = queue.poll();
            queue.add(donwNumber);
        }
         */

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(queue.peek()));
        bw.flush();
        bw.close();
    }
}

        /**
         * 동적으로 변하는 queue.size()를 기준으로 for문을 실행하면 안된다!!!!!!
         *  queue의 size가 0일 때 멈추라고 했음에도 불구하고 반복문 종료 후 size를 출력하면 2가 출력된다.
         *  이러한 경우 while문을 사용하면 간편하다.
         *  또는 이러한 경우 변수 n을 사용해도 됐을 것이다.
         *
         *
        for (int i = 0; i < queue.size(); i++) {
            queue.remove(queue.get(0));
            int downNumber = queue.get(0);

            queue.remove(queue.get(0));
            queue.add(downNumber);

             if (queue.size() == 0) {// 요소가 1개 -> linkedlist는 0부터 시작.
             break;
         }
         }

        System.out.println(queue.size()); // 2
         */