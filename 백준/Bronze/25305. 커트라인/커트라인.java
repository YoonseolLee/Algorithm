import java.util.Arrays;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int studentCount = Integer.parseInt(st.nextToken());
        int prizeStudentCount = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Integer[] array = new Integer[studentCount];

        for (int i = 0; i < studentCount; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }
        
        // Comparator.reverseOrder는 자료형이 기본형일 떄만 가능.
        // ex) int[] 불가, Integer[] 가능
        Arrays.sort(array, Comparator.reverseOrder());

        int cutLine = array[prizeStudentCount - 1];
        System.out.println(cutLine);

        bw.flush();
        bw.close();
        br.close();
    }
}
