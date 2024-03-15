import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] originalArray = new int[8];
        for (int i = 0; i < 8; i++) {
            String number = br.readLine();
            originalArray[i] = Integer.parseInt(number);
        }

        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        Arrays.sort(copiedArray);

        int[] tempArray = new int[5];
        for (int i = 0; i < 5; i++) {
            tempArray[i] = copiedArray[i + 3];
        }
        int sum = Arrays.stream(tempArray).sum();

//        int[] indexContainer = new int[5];
        List<Integer> indexContainer = new ArrayList<>();
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < tempArray.length; j++) {
                if (originalArray[i] == tempArray[j]) {
                    indexContainer.add(i + 1);
                }
            }
        }

        int[] answerArray = indexContainer.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(sum);

        for (int i = 0; i < answerArray.length; i++) {
            if (i != answerArray.length - 1) {
                System.out.print(answerArray[i] + " ");
            } else {
                System.out.print(answerArray[i]);
            }
        }
    }
}

