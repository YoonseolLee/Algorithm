import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(br.readLine());
            list.add(number);
        }

        int average = calcAverage(list);
        int middle = calcMiddle(list);

        System.out.println(average);
        System.out.println(middle);
    }

    static int calcAverage(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        int answer = sum / 5;
        return answer;
    }

    static int calcMiddle(List<Integer> list) {
        Collections.sort(list); // 오름차순 정렬
        int middleNum = list.get(2);
        return middleNum;
    }
}