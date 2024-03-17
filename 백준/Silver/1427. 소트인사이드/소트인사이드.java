import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            int numericValue = Character.getNumericValue(number.charAt(i));
            list.add(numericValue);
        }

        Collections.sort(list,Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}