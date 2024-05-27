import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < repeat; i++) {
            String input = br.readLine();
            String[] split = input.split(" ");
            List<Integer> tempList = new ArrayList<>();

            for (String s : split) {
                tempList.add(Integer.valueOf(s));
            }
            list.add(tempList);
        }

        int count = 0;
        Set<Integer> record = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {

            int startNum = list.get(i).get(0);
            int secondNum = list.get(i).get(1);

            if (record.contains(startNum)) {
                continue;
            }
            record.add(startNum);

            for (int j = i; j < list.size(); j++) {
                if (list.get(j).get(0) == startNum) {
                    if (list.get(j).get(1) != secondNum) {
                        secondNum = list.get(j).get(1);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}



