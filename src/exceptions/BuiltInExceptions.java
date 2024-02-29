package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltInExceptions {
    public static void main(String[] args) {
        int a = 1, b;
        try {
            b = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        processInput();
    }

    static void processInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = 0;
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong format");
        }
        System.out.println(a);

    }
}
