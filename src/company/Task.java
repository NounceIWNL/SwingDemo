package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
ArrayList<Stack>
 */

public class Task {
    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
//        stack.push("1");
//        String s = stack.pop();

        //упаковка большой коробки
        List<Stack<String>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < 5; j++)
                stack.push(String.format("string %d", i * 5 + j));
            list.add(stack);
        }

        //изменение 2-ой строки в 1-ой коробке
        Stack<String> st = list.get(1);
        st.set(2, "string selected");

        //распаковка
        for (int i = 0; i < list.size(); i++) {
            Stack<String> stack = list.get(i);
            while (!stack.empty()) {
                String s = stack.pop();
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}