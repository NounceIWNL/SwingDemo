package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltInExceptions {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        try {
            int c = arr[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        TestClass testClass = null;
        try {
            testClass.print();
        } catch (NullPointerException e) {
            System.out.println("null pointer");
        }

        System.out.println("ok");

        try {
            int a = Integer.parseInt("1.2");
        } catch (NumberFormatException e) {
            System.err.println("number format");


        }


        int a = 1, b;
        try {
            b = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        processInput();
        proccesDividedMyZero();
    }

    static void processInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = 0;
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong format");//с помощью соута
//            e.printStackTrace();//стандартный способ вывода
        }
        System.out.println(a);

    }

    static void proccesDividedMyZero() {


    }
}

class TestClass {
    private int i = 0;

    public void print() {
        System.out.println("print");
    }
}
