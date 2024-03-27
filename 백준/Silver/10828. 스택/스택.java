import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++) {
            String input = br.readLine();
            list.add(input);
        }

        for (String str : list) {
            function(str, stack);
        }
    }

    static void function(String str, Stack<Integer> stack) {
        if (str.contains("push")) {
            String[] splitList = str.split(" ");
            int number = Integer.parseInt(splitList[1]);
            push(number, stack);
        }
        if (str.equals("pop")) {
            pop(stack);
        }
        if (str.equals("size")) {
            size(stack);
        }
        if (str.equals("empty")) {
            empty(stack);
        }
        if (str.equals("top")) {
            top(stack);
        }
    }

    static void push(int n, Stack<Integer> stack) {
        stack.push(n);
    }

    static void pop(Stack<Integer> stack) {
        if (stack.size() == 0) {
            System.out.println(-1);
        } else {
            int peekNumber = stack.peek();
            System.out.println(peekNumber);
            stack.pop();
        }
    }

    static void size(Stack<Integer> stack) {
        int size = stack.size();
        System.out.println(size);
    }

    static void empty(Stack<Integer> stack) {
        if (stack.empty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void top(Stack<Integer> stack) {
        if (stack.empty()) {
            System.out.println(-1);
        } else {
            System.out.println(stack.peek());
        }
    }
}