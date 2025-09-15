package Lec8_ObjectAndClass.MethodOverLoading.Number;

public class Number {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
